package be.intecbrussel.app;

import java.util.Random;

public class Person implements Runnable{

   //properties
    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;

    //constructors


 public Person(String name, int age, int heartBeatMilliSeconds) {

     this.name = name;
     this.age = age;

     life = new Thread(this);
     heart = new Thread(new HeartBeat(heartBeatMilliSeconds));
     breathing = new Thread(new Lungs());

 }

    public Person() {
    }

    //methods
    @Override
    public void run() {

        Random random = new Random();
        int x = random.nextInt(20);

            for (int i = this.age; i < 100 ; i++) {
                try {
                    x++;
                    if (x == 13) {
                        endLife();
                    break;
                }
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(x);
            }
 }



    public void startLife() {
     life.start();
     heart.start();
     breathing.start();
 }

    public void endLife() {

     life.interrupt();
     heart.interrupt();
     breathing.interrupt();

    }
}
