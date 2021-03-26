package sk.stuba.fei.uim.oop;

public class Player {

    private String name;
    private int position;
    private int budget;
    private String buildings;
    private boolean inJail;
    private int lapsInJail;
    private boolean dead;
    Start start = new Start();

    public Player()
    {
        name = new String("UNKNOWN");;
        position = start.getStartPosition();
        budget = 500;
        buildings = "None";
        inJail = false;
        lapsInJail = 0;
        dead = false;
    }

    public Player(String nick)
    {
        name = nick;
        position = start.getStartPosition();
        budget = 500;
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

    //Set the player in jail (or free him)
    public void setInJail(boolean status)
    {
        inJail = status;
    }

    //Substract one lap from punishment
    public void substractOneLapInJail()
    {
        lapsInJail -=1;
    }

    //Add two laps to his punishment
    public void addLapsinJail()
    {
        lapsInJail+=2;
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

    //Get buildings bought by player
    public String getBuildings()
    {
        return buildings;
    }

    //Get buildings bought by player
    public void addBuildings(String newBuilding)
    {
        buildings += ", " + newBuilding;
    }

    //Set new budget for player -> add or subtract money
    public void setBudget(int money)
    {
        budget += money;
    }

    //Is player dead?
    public boolean isDead()
    {
        return dead;
    }

    //Kill player
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
