package Java8;
import java.util.stream.Collectors;
import static java.util.Map.Entry.comparingByValue;

class MaxOccurrenceCharacter {

    public static void main(String[] args) {

        String str = "Hello World";
        Character maxChar = str.chars().mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().max(comparingByValue()).get().getKey();

        System.out.println("Maximum occurring letter is : " + maxChar);


        String str1 = "aaabcc";
        Character minChar = str1.chars().mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().min(comparingByValue()).get().getKey();

        System.out.println("Minimum occurring letter is : " + minChar);

    }
}

