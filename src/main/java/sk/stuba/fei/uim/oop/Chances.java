package sk.stuba.fei.uim.oop;

public class Chances {

    private int moneyFromChance;

    public Chances(){

        moneyFromChance = 0;
    }

    //Choosing chance reward based on card number
    public int getChance(int numberOfChanceCard)
    {
        if( numberOfChanceCard == 1)
        {
            moneyFromChance = 100;
        }
        if( numberOfChanceCard == 2)
        {
            moneyFromChance = 200;
        }
        if( numberOfChanceCard == 3)
        {
            moneyFromChance = 300;
        }
        if( numberOfChanceCard == 4)
        {
            moneyFromChance = -100;
        }
        if( numberOfChanceCard == 5)
        {
            moneyFromChance = -150;
        }
        if( numberOfChanceCard == 6)
        {
            moneyFromChance = -200;
        }
        if( numberOfChanceCard == 7)
        {
            moneyFromChance =-1;
        }
        if( numberOfChanceCard == 8)
        {
            moneyFromChance = 1;
        }
        if( numberOfChanceCard == 9)
        {
            moneyFromChance = 800;
        }
        if( numberOfChanceCard == 10)
        {
            moneyFromChance = 50;
        }
        return moneyFromChance;
    }
}
