package CoreJava;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Hello", reverseStr = "";

        int l = str.length();

        for (int i = l - 1; i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a CoreJava.Palindrome String.");
        }
        else {
            System.out.println(str + " is not a CoreJava.Palindrome String.");
        }
    }
}
