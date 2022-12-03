package Java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

        List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        even.forEach(x -> System.out.println(x));

        numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

        List<Integer> odd = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        odd.forEach(x -> System.out.println(x));

        int[] arr = {1,2,3,4};

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length ; i++){
            list.add(new Integer(arr[i]));
        }

        list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

    }
}
