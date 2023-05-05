package be.intecbrussel.app;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Person implements Runnable{

   //properties
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;


    //constructors


 public Person(String name, int age, int heartBeatMilliSeconds) {

     this.name = name;
     this.age = age;

     this.life = new Thread(this);
     this.heart = new Thread(new HeartBeat(heartBeatMilliSeconds));
     this.breathing = new Thread(new Lungs());

 }

    public Person() {
    }

    //methods
    @Override
    public void run() {
            for (int i = this.age; i < 100; i++) {
                try {
                    int boundedRandomValue = ThreadLocalRandom.current().nextInt(0, 20);
                    System.out.println(boundedRandomValue);
                    if (boundedRandomValue == 13) {
                        break;
                    }
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.endLife();
 }

    public void startLife() {
     System.out.println(ANSI_GREEN + "Start life" + ANSI_RESET);
        this.life.start();
        this.heart.start();
        this.breathing.start();
 }

    public void endLife() {

     System.out.println(ANSI_GREEN + "End life" + ANSI_RESET);
     this.life.interrupt();
     this.heart.interrupt();
     this.breathing.interrupt();

    }
}
