package be.intecbrussel.app;

public class HeartBeat extends Person implements Runnable{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    //properties
    private int milliSecondsBetweenBeats;

    //constructors

    public HeartBeat(int milliSecondsBetweenBeats) {
        this.milliSecondsBetweenBeats = milliSecondsBetweenBeats;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(milliSecondsBetweenBeats);
            } catch (InterruptedException e) {
                System.err.println("The heart is stopped");
                break;
            }
            System.out.println(ANSI_YELLOW + "-^^-^--^-Thump-^^-^-^--" + ANSI_RESET);
        }

    }
}
