package Basics;
import java.util.Scanner;

public class PrimeNumbersTillN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit : ");
        int low = sc.nextInt();
        System.out.println("Enter upper limit : ");
        int high = sc.nextInt();
        for(int i = low ; i <= high ; i++){
            int count = 0;

            for(int div = 2; div * div <= i ; div++){
                if(i % div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println(i);
            }
        }

    }
}
