package HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(2,"ram");
        map.put(8,"john");
        map.put(3,"alex");
        map.put(10,"bhavik");
        map.put(40,"swati");
        map.put(5,"anmol");

        System.out.println(map);
        System.out.println(map.size());

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.entrySet().stream().forEach( x -> {
            System.out.println(x.getKey() + " : " + x.getValue());
        });
    }
}
