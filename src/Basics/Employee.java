package Basics;
import java.util.List;
public class Employee {

    private String name;
    private int id;
    private List<String> phoneNumbers;

    public Employee(String name, int id, List<String> phoneNumbers) {
        this.name = name;
        this.id = id;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
