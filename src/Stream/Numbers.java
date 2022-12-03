package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
         numbers.stream().filter(x -> x > 5).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

    }
}
