package Basics;
public class PalindromicNumber {

    public static void main(String[] args) {

        int number = 121;
        int temp,r;
        int sum = 0;

        temp = number;

        while(number > 0){

            r = number % 10;
            sum = (sum * 10) + r;
            number /= 10;
        }

        if(temp == sum){
            System.out.println("Palindromic Number");
        }else
            System.out.println("Not a Palindromic Number");

    }
}
