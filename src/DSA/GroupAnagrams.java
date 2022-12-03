package DSA;
import java.util.*;
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!anagrams.containsKey(sorted)){
                anagrams.put(sorted, new ArrayList<>());
            }
            anagrams.get(sorted).add(str);
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        GroupAnagrams anagrams = new GroupAnagrams();
        System.out.println(anagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
