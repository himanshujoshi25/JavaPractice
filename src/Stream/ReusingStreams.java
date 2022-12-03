package Stream;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReusingStreams {

    public static void main(String[] args) {

        //Can we reuse a stream?
        String[] input = {"Ram","John","Rohan","Amit","Ram"};

//        Stream<String> stringStream = Arrays.asList(input).stream();
//        stringStream.forEach(x -> System.out.println(x));
//
//        long count = stringStream.filter(x -> "Ram".equals(x)).count();
//        System.out.println(count);

        Supplier<Stream<String>> inputStream = () -> Stream.of(input);

        inputStream.get().forEach(x -> System.out.println(x));

        long count = inputStream.get().filter(x -> "Ram".equals(x)).count();
        System.out.println(count);

    }
}
