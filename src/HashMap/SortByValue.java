package HashMap;
import java.util.*;

public class SortByValue {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(12,"jack");
        map.put(18,"bob");
        map.put(2,"ram");
        map.put(8,"john");
        map.put(3,"alex");

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        List<Map.Entry<Integer,String>> list = new ArrayList<>(entrySet);

        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        list.forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));

    }
}
