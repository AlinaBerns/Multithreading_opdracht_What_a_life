import be.intecbrussel.app.HeartBeat;
import be.intecbrussel.app.Lungs;
import be.intecbrussel.app.Person;

public class Main {
    public static void main(String[] args) {
        Person jerry = new Person("Jerry", 70, 5000);
        jerry.startLife();

        Person ann = new Person("Ann", 40, 3000);
        ann.startLife();

        Person anis = new Person("Anis", 60, 6000);
        anis.startLife();

        Person eric = new Person("Eric", 50, 1000);
        eric.startLife();
    }
}