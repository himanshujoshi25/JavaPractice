package CoreJava;

import java.util.Scanner;
public class FirstNonRepeatingChar {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();

        for(char ch : str.toCharArray()){
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character is: " + ch);
                break;
            }
        }

        for(char ch : str.toCharArray()){
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("Non repeating character : " + ch);

            }
        }
    }
}
