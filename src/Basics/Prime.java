package Basics;
public class Prime {

    public static void main(String[] args) {

        int number = 111;

        int count = 0;

        for(int div = 2; div * div <= number ; div++){
            if(number % div == 0){
                count++;
                break;
            }
        }

        if(count == 0){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
}
