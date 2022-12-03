package CoreJava;
public class Test {

    public static void main(String[] args) {

        FunctionalInterfaceDemo result = ((a, b,c) -> a * b * c);
        System.out.println(result.multiply(10,2,10));

    }
}
