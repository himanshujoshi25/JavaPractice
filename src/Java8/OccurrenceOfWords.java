package Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfWords {

    public static void main(String[] args) {

        String str = "Welcome to TCS hello world hello";
        List<String> words = Arrays.asList(str.split(" "));

        Map<String, Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        System.out.println(map);

        List<Integer> nums = Arrays.asList(1,2,3,4,1,2,10,10,8,9);

        Map<Integer, Long> numbers = nums.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        numbers.forEach((key,value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println("***********************************************************************************");

        //Traditional Way
        List<String> days = Arrays.asList("Monday","Tuesday","Wednesday","Monday");
        Map<String,Integer> m = new HashMap<>();
        for(String s : days){
            m.put(s, m.containsKey(s) ? m.get(s) + 1 : 1);
        }
        m.entrySet().stream().forEach(x -> {
            System.out.println(x.getKey() + " : "  + x.getValue());
        });

        //Traditional Way
        List<Integer> numbers1 = Arrays.asList(10,50,10,50,20,60);
        Map<Integer,Integer> map1 = new HashMap<>();
        for(Integer i : numbers1){
            if(map1.containsKey(i)){
                int count = map1.get(i);
                count++;
                map1.put(i,count);
            }else{
                map1.put(i,1);
            }
        }
        System.out.println(map1);
    }
}
