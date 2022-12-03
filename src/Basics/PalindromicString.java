package Basics;
public class PalindromicString {

    public static void main(String[] args) {

        String str = "ram";

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a Palindromic string");
                left++;
                right--;
            } else {
                System.out.println("Palindromic String");
                break;
            }
        }
    }
}
