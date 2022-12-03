package CoreJava;
import java.util.List;

class Engine{
    int speed;
    Engine(int speed){
        this.speed = speed;
    }

}
public final class ImmutableClass {

    private final int id;
    private final String name;
    private final List<String> phoneNumbers;

    private final Engine engine;

    public ImmutableClass(int id, String name, List<String> phoneNumbers,Engine e) {
        this.id = id;
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        Engine newEngine = new Engine(e.speed);
        this.engine = newEngine;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }


    public static void main(String[] args) {

        Engine e = new Engine(50);

    }
}
