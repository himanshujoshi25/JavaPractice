package HashMap;
import java.util.HashMap;

public class OccurrenceOfCharacters {

    public static void main(String[] args) {

        String str = "google";

        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i <= str.length() - 1 ; i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);

        map.entrySet().stream().forEach(x -> {
            System.out.println(x.getKey() + " : "  + x.getValue());
        });
    }
}
