package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,10,40,60,80,30,10,10);
        Set<Integer> set = new HashSet<>();

        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Prints all the unique elements in the list

       // list.stream().distinct().collect(Collectors.toList()).forEach(x -> System.out.println(x));
        //list.stream().filter(x -> set.add(x)).forEach(x -> System.out.println(x));
//
//        System.out.println("****************************************************************************");
//        //Prints all the duplicate elements in the list
//
          list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
//        list.stream().limit(4).forEach(x -> System.out.println(x));
//        list.stream().skip(4).forEach(x -> System.out.println(x));
    }
}
