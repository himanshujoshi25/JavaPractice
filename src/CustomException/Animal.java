package CustomException;
public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) throws AgeAnimalException {

        if (age < 0) {
            throw new AgeAnimalException("Age of animal can't be negative.");
        } else {
            this.name = name;
            this.age = age;
            System.out.println("Animal created.");
        }
    }
}