package sk.stuba.fei.uim.oop;

public class Start {
    private String startSpeech;
    private int startPosition;

    public Start()
    {
        startSpeech = "\nGood job, you survived another round. Now you are standing on START, here is 200 money to your budget\n";
        startPosition = 1;
    }

    public String getStartSpeech()
    {
        return startSpeech;
    }
    public int getStartPosition()
    {
        return startPosition;
    }
}
