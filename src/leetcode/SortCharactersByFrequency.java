package leetcode;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char current = maxHeap.remove();
            for(int i = 0; i < map.get(current) ; i++){
                sb.append(current);
            }
        }
        return sb.toString();
    }
}
