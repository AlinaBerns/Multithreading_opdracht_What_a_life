package be.intecbrussel.app;

public class Lungs extends Person implements Runnable{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    //properties
    private boolean lungsFull = true;

    //constructors
    public Lungs() {
    }

    @Override
    public void run() {
        while (true) {
            if (!lungsFull) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Something wrong...");
                }
                System.out.println(ANSI_BLUE + "Breathe in" + ANSI_RESET);
                lungsFull = true;
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Something wrong...");
                }
                System.out.println(ANSI_PURPLE + "Breathe out" + ANSI_RESET);
                lungsFull = false;
            }
        }

    }
}
