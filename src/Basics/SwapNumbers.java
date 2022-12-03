package Basics;
import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

        int arr[] = {1,2,3};
        int brr[] = new int[arr.length];
        int index = 0;

        for(int i = arr.length - 1; i >= 0; i--){
            brr[index++] = arr[i];
        }
        for(int j = 0; j < brr.length; j++){
            System.out.print("  " + brr[j]);
        }

    }
}
