package sk.stuba.fei.uim.oop;
import java.util.LinkedList;
import java.util.Queue;

public class Chances {

    private Queue<Integer> q = new LinkedList<>();

    public Chances(){

        int moneyFromChance = 50;
        int fineFromChance = -30;

        for (int i = 0; i < 5; i++) {
            if (i%2==0){
                q.add(moneyFromChance);
            }
            if (i%2!=0){
                q.add(fineFromChance);
            }
            moneyFromChance+=20;
            fineFromChance-=20;
        }
    }

    public int getChance() {
        int firstCard = q.peek();
        int removeFirstCardFromPack= q.remove();
        q.add(firstCard); //adding grabbed card at the end of pack
        return firstCard;
    }
}
