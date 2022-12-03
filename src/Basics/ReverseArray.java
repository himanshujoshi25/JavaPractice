package Basics;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {6,2,6,1,3,2};

        Arrays.stream(arr).sorted().forEach(System.out::println);

        List<Integer> list = Arrays.asList(10,5,1,2);
        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Integer> descending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descending);

        int[] array = {1, 2, 3};
        System.out.println("array before reverse: " + Arrays.toString(array) );

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for(int a : array){
            System.out.print(" " + a);
        }

        System.out.println("array after reverse: " + Arrays.toString(array) );
    }
}
