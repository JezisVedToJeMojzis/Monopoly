package sk.stuba.fei.uim.oop;
import java.util.Random;

public class Dice {

    private int throwTheDice;

    public Dice() {
        int min = 1;
        int max = 6;

        Random random = new Random();

        throwTheDice = random.nextInt(max + min) + min;
    }

    //Get random number from dice
    public int getDice(){
        return throwTheDice;
    }
}
