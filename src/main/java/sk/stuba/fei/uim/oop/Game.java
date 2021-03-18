package sk.stuba.fei.uim.oop;
import  java.util.Scanner;
import java.util.ArrayList;


public class Game {

    public static ArrayList<Player> players;
    public static ArrayList<Building> buildings;

    //Press enter to continue function
    private void pressEnterToContinue()
    {
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }


    public static void main(String[] args) {

        //Dice object
        Dice dice = new Dice();

        //Player object
        Player player = new Player();

        //Setting building objects (name,cost,fine,position)
        Building [] buildings = new Building [16];
        String nameOfBuilding;
        int cost = 100;
        int fine = 25;
        String names = "Building1";
        for (int i = 0; i < 16; i++)
        {
            if (i==1)
            {
                names = "Building2";
            }
            if (i==2)
            {
                names = "Building3";
            }
            if (i==3)
            {
                names = "Building4";
            }
            if (i==4)
            {
                names = "Building5";
            }
            if (i==5)
            {
                names = "Building6";
            }
            if (i==6)
            {
                names = "Building7";
            }
            if (i==8)
            {
                names = "Building9";
            }
            if (i==9)
            {
                names = "Building10";
            }
            if (i==10)
            {
                names = "Building11";
            }
            if (i==11)
            {
                names = "Building12";
            }
            if (i==12)
            {
                names = "Building13";
            }
            if (i==13)
            {
                names = "Building14";
            }
            if (i==14)
            {
                names = "Building15";
            }
            if (i==15)
            {
                names = "Building16";
            }
            nameOfBuilding = names;
            buildings[i] = new Building(nameOfBuilding);
            buildings[i].setCost(cost);
            buildings[i].setFine(fine);
            cost+=50;
            fine+=25;
            if (i==0)
            {
                buildings[i].setPosition(2);
            }
            if (i==1)
            {
                buildings[i].setPosition(3);
            }
            if (i==2)
            {
                buildings[i].setPosition(5);
            }
            if (i==3)
            {
                buildings[i].setPosition(6);
            }
            if (i==4)
            {
                buildings[i].setPosition(8);
            }
            if (i==5)
            {
                buildings[i].setPosition(9);
            }
            if (i==6)
            {
                buildings[i].setPosition(11);
            }
            if (i==8)
            {
                buildings[i].setPosition(12);
            }
            if (i==9)
            {
                buildings[i].setPosition(14);
            }
            if (i==10)
            {
                buildings[i].setPosition(15);
            }
            if (i==11)
            {
                buildings[i].setPosition(17);
            }
            if (i==12)
            {
                buildings[i].setPosition(18);
            }
            if (i==13)
            {
                buildings[i].setPosition(20);
            }
            if (i==14)
            {
                buildings[i].setPosition(21);
            }
            if (i==15)
            {
                buildings[i].setPosition(22);
            }
        }

        //Welcome message
        System.out.println("\n***!WELCOME TO MONOPOLY!***\n");

        //Select number of players
        int numberOfPlayers = 0;
        while (true) {
            Scanner number = new Scanner(System.in);
            System.out.println("Enter number of players (min: 3/max: 5) : ");
            numberOfPlayers = number.nextInt();
            if (numberOfPlayers <= 2) {
                System.out.println("You need to choose more players.");
            }
            if (numberOfPlayers >= 5) {
                System.out.println("You need to choose less players.");
            }
            if (numberOfPlayers == 3 | numberOfPlayers == 4 | numberOfPlayers == 5) {
                System.out.println("You chose " + numberOfPlayers + " players.");
                break;
            }
        }
        //Press enter to continue
        Game enter = new Game();
        enter.pressEnterToContinue();

        //Set names of players
        System.out.println("Now choose names of players");
        Player [] players = new Player [numberOfPlayers];
        String nameOfPlayer;
        for (int i = 0; i < numberOfPlayers; i++)
        {
            Scanner name = new Scanner(System.in);
            System.out.println("Enter name of player number " + (i+1) + " :");
            nameOfPlayer = name.nextLine();
            players[i] = new Player(nameOfPlayer);
        }

        //Press enter to continue
        System.out.println("After pressing enter a profile of each player will be displayed");
        enter.pressEnterToContinue();

        //Print players profiles
        for (int i = 0; i < numberOfPlayers; i++)
        {
            System.out.println(players[i]);
        }

        System.out.println("Players are at START (position 1)\n");
        System.out.println("***!THE GAME CAN BEGIN!***\n");
        enter.pressEnterToContinue();


        int numberFromDice;
        int newPosition;
        for (int j = 0; j<numberOfPlayers; j++)
        {
            //Skipping dead players
            if (players[j].isDead()== true)
            {
                j++;
            }

            System.out.println("\n***Player [" + players[j].getName() + "] is on turn***");
            System.out.println("\nHere is your profile:\n" + players[j] + "\n");
            //If current player is in jail - skip him and substract one lap from his punishment
            if (players[j].isInJail() == true)
            {
                //If laps in prison = 0 set him free
                if (players[j].getLapsInJail()==0)
                {
                    players[j].setInJail(false);
                    System.out.println("\nGOOD NEWS, YOU ARE FREE FROM PRISON\n");
                    System.out.println("\nYour current status in jail is false, here is your updated profile:\n" + players[j] + "\n");
                    enter.pressEnterToContinue();
                }
                //If laps in prison > 0
                else{
                    System.out.println("\n###YOU ARE IN PRISON, BETTER BE QUIET###\n");
                    System.out.println("\n###The remaining length of your punishment is: " + players[j].getLapsInJail() + " laps");
                    System.out.println("\nProceed to next players turn");
                    players[j].substractOneLapInJail();
                    enter.pressEnterToContinue();
                    j++;
                    System.out.println("\n***Player [" + players[j].getName() + "] is on turn***");
                    System.out.println("\nHere is your profile:\n" + players[j] + "\n");

                }
            }

            //Throwing dice
            numberFromDice = dice.getDice();
            System.out.println("\n[" + players[j].getName() + "] threw dice and the number that has landed is " + numberFromDice+ "\n");

            //Setting new position based on number from dice
            players[j].setPosition(players[j].getPosition()+numberFromDice);
            newPosition= players[j].getPosition();
            int lastPosition = newPosition;
            System.out.println("New position of player [" + players[j].getName() + "] is: " + newPosition +"\n");

            //If player finishes round
            if (newPosition > 24)
            {
                newPosition = numberFromDice - (24 - lastPosition);
                //If player is on START
                if (newPosition == 1)
                {
                    System.out.println("\nGood job, you survived another round. Now you are standing on START, here is 200 money to your budget");
                    players[j].setBudget(200);
                    System.out.println("\nYour current budget is: " + players[j].getBudget());
                }
                //If player passed START
                else{
                    System.out.println("\nYou went throught the START. You are getting 200 money to your budget");
                    players[j].setBudget(200);
                    System.out.println("\nYour current budget is: " + players[j].getBudget());
                }
            }

            //*** STEPPING ON BUILDING ***
            int answerFromPlayer;
            for (int i = 0;i<16;i++)
            {
                //If nobody owns building on players position
                if (newPosition == buildings[i].getPosition() && buildings[i].getOwner()== "None")
                {
                    System.out.println("\nOn this position is building named <" + buildings[i].getName() +  "> that doesnt belong to anybody\nDo you want to purchase it for " + buildings[i].getCost() + " money? [1/0]\n");
                    Scanner answer = new Scanner(System.in);
                    answerFromPlayer = answer.nextInt();

                    //If player decides to buy building
                    if (answerFromPlayer==1)
                    {
                        buildings[i].setOwner(players[j].getName());
                        System.out.println("Congratulations! You just bought yourself a brand new property!\nTheres some information about this building:\n\n" + buildings[i]);

                    }
                    //If player decides to not buy building
                    if (answerFromPlayer==0)
                    {
                        System.out.println("\nUnderstandable. Have a great day sir!\n");
                    }
                    //If player writes some nonsense
                    else
                    {
                        System.out.println("\nInvalid answer... Try again!\n");
                    }
                }

                //If somebody owns building on players position
                if (newPosition == buildings[i].getPosition() && buildings[i].getOwner()!= "None")
                {
                    System.out.println("\nOn this position is building named <" + buildings[i].getName() +  "> that belongs to player [" + buildings[i].getOwner() + "]\nThe fine by steppin on his property is " + buildings[i].getFine() + " and it was automatically taken from your budget\n");
                    players[j].setBudget(-buildings[i].getFine());

                    //If players budget is under 0 , player dies and all his buildings are now free to buy
                    if (players[j].getBudget()<0)
                    {
                        players[j].setDead();//rip
                        for (int k = 0;k<16;k++)
                        {
                            if(buildings[k].getOwner() == players[j].getName())
                            {
                                buildings[k].setOwner("None");
                            }
                        }

                    }
                }

                //uz len vazenie policia parkovisko sance
            }



        }




    }
}
