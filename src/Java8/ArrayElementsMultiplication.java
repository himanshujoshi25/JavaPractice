package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayElementsMultiplication {

    public static void main(String[] args) {

        Integer[] input = {1, 2, 3, 4, 5};

        List<Integer> integerList = Arrays.asList(input);
        Optional<Integer> result = integerList.stream().reduce((a, b) -> a * b);
        System.out.println(result.get());

        //Traditional Way
        Integer multiply = 1;
        for(Integer nums : integerList){
            multiply *= nums;
        }
        System.out.println(multiply);
    }
}
