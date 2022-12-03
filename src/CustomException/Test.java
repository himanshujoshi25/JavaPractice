package CustomException;
public class Test {

    public static void main(String[] args) {

        Animal dog = null;

        try{
            dog = new Animal("I am a dog", 10);
        }
        catch (AgeAnimalException e){
            System.out.println(e.getMessage());
        }
    }
}
