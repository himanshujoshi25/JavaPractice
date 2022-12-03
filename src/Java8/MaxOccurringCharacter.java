package Java8;
import java.util.Scanner;
public class MaxOccurringCharacter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System. in);
        System.out.println("Enter the String:");
        String s = in.nextLine();
        int[] hash_table = new int[128];

        for (int i = 0; i < s.length() ; i++){
            hash_table[s.charAt(i)]++;
        }
        int max_count = 0;
        char ans = 'a';
        for (int i = 0; i < 128; i++){
            if (hash_table[i] > max_count)
            {
                max_count = hash_table[i];
                ans = (char) i;
            }
        }
        System.out.println("Maximum occurring character is : "+ ans +" which occurred " + max_count+ " times ");
    }
}
