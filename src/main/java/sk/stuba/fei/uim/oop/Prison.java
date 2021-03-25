package sk.stuba.fei.uim.oop;

public class Prison {
    private String prisonSpeech;
    private int prisonPosition = 7;

    public Prison()
    {
        prisonSpeech = "\nYou are on educational excursion in prison. ENJOY! :)\n";
        prisonPosition = 7;
    }
    public String getPrisonSpeech()
    {
        return prisonSpeech;
    }
    public int getPrisonPosition()
    {
        return prisonPosition;
    }
}
