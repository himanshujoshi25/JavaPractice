package CoreJava;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 3553, reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is CoreJava.Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not CoreJava.Palindrome.");
        }
    }
}
