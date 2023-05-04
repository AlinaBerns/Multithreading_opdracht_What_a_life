import be.intecbrussel.app.HeartBeat;
import be.intecbrussel.app.Lungs;
import be.intecbrussel.app.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jerry", 70, 5000);
        person.startLife();
    }
}