package sk.stuba.fei.uim.oop;

public class Police {
    private String policeBrutality;
    private int policePosition;

    public Police()
    {
        policeBrutality = "\nYou were caught by the Police! You were sentenced to spend 2 laps in prison!!!\n";
        policePosition = 19;
    }

    public String getPoliceSpeech()
    {
        return policeBrutality;
    }
    public int getPolicePosition()
    {
        return policePosition;
    }
}
