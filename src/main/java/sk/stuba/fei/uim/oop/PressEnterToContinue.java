package sk.stuba.fei.uim.oop;

public class PressEnterToContinue {

    public void pressEnterToContinue()
    {
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}
