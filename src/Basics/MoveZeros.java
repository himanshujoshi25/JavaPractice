package Basics;
public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0,12,13,0,4,6,0};

        int count = 0;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count < arr.length){
            arr[count++] = 0;
        }

        for(int i = 0; i < arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
    }
}
