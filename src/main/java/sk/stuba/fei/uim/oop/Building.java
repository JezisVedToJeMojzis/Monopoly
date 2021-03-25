package sk.stuba.fei.uim.oop;

public class Building {

    public String name;
    public int cost;
    public int fine;
    public int position;
    public String owner;

    public Building(String nick){

        name = nick;
        cost = 0;
        fine= 0;
        position = 0;
        owner = "None";
    }

    //Get name of player who owns this building.
    public String getOwner ()
    {
        return owner;
    }

    //Set new owner of building
    public void setOwner (String nick)
    {
        owner = nick;
    }

    //Set new name of building
    public void setName (String nick)
    {
        name = nick;
    }

    //Get name of building
    public String getName ()
    {
        return name;
    }

    //Get cost of building
    public int getCost()
    {
        return cost;
    }

    //Set cost of building
    public void setCost(int number)
    {
        cost = number;
    }

    //Get fine of building when u step on it
    public int getFine()
    {
        return fine;
    }

    //Set fine of building
    public void setFine(int number)
    {
        fine = number;
    }
    //Get position of building
    public int getPosition()
    {
        return position;
    }

    public void setPosition(int newPosition)
    {
        position=newPosition;
    }

    public String toString ()
    {
        String currentState=
                "Name of building: " + name + "\n" +
                "Cost: " + cost + "\n" +
                "Fine: " + fine + "\n" +
                        "Position: " + position + "\n" +
                "Owner: " + owner + "\n" ;

        return currentState;
    }

}
