package Basics;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to check :");
        int t = sc.nextInt();
        for(int i = 0; i < t ; i++){
            System.out.println("Enter the number to check :");
            int n = sc.nextInt();

            int count = 0;
            for(int div = 2; div * div <= n ; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not a Prime Number");
            }
        }
    }
}
