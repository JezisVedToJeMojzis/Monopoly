package sk.stuba.fei.uim.oop;

public class Building {

    public int cost;
    public int fine;
    public String owner;

    public Building(){

        cost = 0;
        fine= 0;
        owner = "None";

    }

    //Get name of player who owns this building
    public String getOwner ()
    {
        return owner;
    }

    //Set new owner of building
    public void setOwner (String nick)
    {
        owner = nick;
    }

    //Get cost of building
    public int getCost()
    {
        return cost;
    }

    //Get fine of building when u step on it
    public int getFine()
    {
        return fine;
    }

    public String toString ()
    {
        return new String (super.toString () +
                "Cost=" + getCost() +
                "Fine=" + getFine() +
                "Owner=" + getOwner() );

    }

}
