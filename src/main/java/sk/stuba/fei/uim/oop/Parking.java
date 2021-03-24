package sk.stuba.fei.uim.oop;

public class Parking {
    private String parkingSpeech;
    private int parkingPosition;

    public Parking()
    {
        parkingSpeech = "\nYou are at parking. You can rest. Next player can get ready.\n";
        parkingPosition = 13;
    }

    public String getParkingSpeech()
    {
        return parkingSpeech;
    }
    public int getParkingPosition()
    {
        return parkingPosition;
    }
}

