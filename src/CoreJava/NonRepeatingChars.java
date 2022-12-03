package CoreJava;

import java.util.Scanner;

public class NonRepeatingChars {

    public static void main(String[] args) {

        Scanner cs=new Scanner(System.in);
        String str;
        System.out.println("Enter your String:");
        str = cs.nextLine();


        int arr[] = new int[256];
        for(int i = 0;i < str.length();i++)
        {
            if(str.charAt(i) != ' ')
                arr[str.charAt(i)]++;
        }
        char ch = ' ';
        System.out.print("All Non-repeating character in a given string is:");
        for(int i = 0;i < str.length();i++)
        {
            if(arr[str.charAt(i)] == 1){
                ch = str.charAt(i);
                System.out.print(ch + " ");
            }
        }
    }
}

