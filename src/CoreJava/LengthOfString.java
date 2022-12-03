package CoreJava;
public class LengthOfString {

    public static void main(String[] args) {

        String str = "Hello World";
        int count = 0;
        char[] ch = str.toCharArray();

        for(int i = 0 ; i < ch.length ;  i++){
            count++;
        }

        System.out.println("Length of the string is " + count);
    }
}
