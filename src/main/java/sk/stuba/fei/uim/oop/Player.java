package sk.stuba.fei.uim.oop;

public class Player {

    private String name;
    private int position;
    private int budget;
    private String buildings;
    private boolean inJail;
    private int lapsInJail;
    private boolean dead;

    public Player()
    {
        name = new String("UNKNOWN");;
        position = 1;
        budget = 250;
        buildings = "None";
        inJail = false;
        lapsInJail = 0;
        dead = false;
    }

    public Player(String nick)
    {
        name = nick;
        position = 1;
        budget = 250;
        buildings = "None";
        inJail = false;
        lapsInJail = 0;
        dead = false;
    }

    //Set player's name
    public void setName(String nick)
    {
        name = nick;
    }

    public String getName()
    {
        return name;
    }

    //Get position of player
    public int getPosition()
    {
        return position;
    }

    //Set new position of player
    public void setPosition(int newPosition)
    {
        position = newPosition;
    }

    //Is he in jail?
    public boolean isInJail()
    {
        return inJail;
    }

    //Set the player in jail
    public void setInJail(boolean status)
    {
        inJail = status;
        if(!inJail) {
            lapsInJail = 0;
        }
    }

    //Set laps in jail to 0 (player is free)
    public void resetLapsInJail()
    {
        lapsInJail = 0;
    }

    //Add one lap to his punishment (max 2)
    public void addJailLap()
    {
        lapsInJail++;
    }

    //Check how long his punishment lasts
    public int getLapsInJail()
    {
        return lapsInJail;
    }

    //Get how much money does player have
    public int getBudget()
    {
        return budget;
    }

    //Set new budget for player -> add or subtract money
    public void setBudget(int money)
    {
        budget += money;
    }

    public boolean isDead()
    {
        return dead;
    }

    public void setDead()
    {
        dead = true;
    }

    public String toString()
    {
        String currentState =
                                "*PLAYER*: [" + name + "]\n" +
                                        "Position = "  + position + "\n" +
                                    "Budget = " + budget      + "\n" +
                                "Buildings = " + buildings   + "\n" +
                                        "In jail? = "  + inJail     + "\n"+
                                         "Dead? = " + dead      + "\n";

        if(inJail) {
            currentState += "How many laps in jail= " + lapsInJail + "\n";
        }

        return currentState;
    }

}
