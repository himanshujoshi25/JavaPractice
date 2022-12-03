package Basics;

public class NumberReverse {

    public static void main(String[] args) {

        int number = 12345;
        int r;
        int sum = 0;

        while(number > 0){

            r = number % 10;
            sum = (sum * 10) + r;
            number /= 10;
        }

        System.out.println(sum);
    }
}
