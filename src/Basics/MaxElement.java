package Basics;
public class MaxElement {

    public static void main(String[] args) {

        int[] arr = {1,-1,2,100,5,10};

        int max = arr[0];

        for(int i = 0; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Max element is : " + max);

        int min = arr[0];

        for(int i = 0; i < arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Minimum element is : " + min);
    }
}
