package Basics;
import java.util.Scanner;

public class LCMANDHCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;
        int gcd;

        while(a % b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        gcd = b;

        System.out.println("GCD is :" + gcd);

        int lcm = (num1 * num2)/gcd;
        System.out.println("LCM is :" + lcm);
    }
}
