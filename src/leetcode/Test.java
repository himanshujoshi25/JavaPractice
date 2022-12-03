package leetcode;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Integer[] a = {1,2,2,3,4,2,5,1};
        List<Integer> numbers = Arrays.asList(a);
        numbers.stream().distinct().forEach(x -> System.out.println(x));

    }
}
