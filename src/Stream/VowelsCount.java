package Stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelsCount {

    public static void main(String[] args) {

        String input = "Hello World";

        long count = input.chars().filter( (x)-> {
         return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
        }).count();

        System.out.println("Number of vowels : " + count);

        System.out.println(input.chars().count());

        System.out.println("****************************************************************************");

        Map<String, Long> output = input.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Object :: toString, Collectors.counting()));

        output.forEach((key,value) -> System.out.println(key + "    :    "+value));

        System.out.println("***************************************************************************");

        //Traditional Way

        List<String> strList = Arrays.asList("Amanda","Rob","Sunny","Amanda","Rob");
        Map<String,Integer> map = new HashMap<>();
        for(String s : strList){
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        System.out.println(map);

        System.out.println(strList.stream().collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting())));

    }
}
