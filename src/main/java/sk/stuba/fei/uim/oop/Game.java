package sk.stuba.fei.uim.oop;
import  java.util.Scanner;
import java.util.ArrayList;


public class Game {

    public static ArrayList<Player> players;

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

        //Creating objects of building
        Building building1 = new Building();
        Building building2 = new Building();
        Building building3 = new Building();
        Building building4 = new Building();
        Building building5 = new Building();
        Building building6 = new Building();
        Building building7 = new Building();
        Building building8 = new Building();
        Building building9 = new Building();
        Building building10 = new Building();
        Building building11 = new Building();
        Building building12 = new Building();
        Building building13 = new Building();
        Building building14 = new Building();
        Building building15 = new Building();
        Building building16 = new Building();

        //Setting costs of buildings
        building1.cost = 100;
        building2.cost = 120;
        building3.cost = 150;
        building4.cost = 180;
        building5.cost = 210;
        building6.cost = 240;
        building7.cost = 270;
        building8.cost = 300;
        building9.cost = 350;
        building10.cost = 400;
        building11.cost = 420;
        building12.cost = 440;
        building13.cost = 460;
        building14.cost = 480;
        building15.cost = 500;
        building16.cost = 600;

        //Setting fines of building
        building1.fine = 50;
        building2.fine = 60;
        building3.fine = 75;
        building4.fine = 90;
        building5.fine = 105;
        building6.fine = 120;
        building7.fine = 135;
        building8.fine = 150;
        building9.fine = 175;
        building10.fine = 200;
        building11.fine = 210;
        building12.fine = 220;
        building13.fine = 230;
        building14.fine = 240;
        building15.fine = 150;
        building16.fine = 300;

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
    }
}
