package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
    public static void main(String[] args) {

        String str = "Today is a sunny day";

        String[] inputArray = str.split(" ");
        StringJoiner joiner = new StringJoiner("-","[","]");
        for (String s : inputArray){
            joiner.add(s);
        }
        System.out.println(joiner.toString());


        List<String> input = Arrays.asList("Hello","How","are","you");
        String output = input.stream().collect(Collectors.joining("-"));
        System.out.println(output);
    }
}
