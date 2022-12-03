package DSA;
import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {
    int i = 0; //starting pointer
    int j = 0; //moving pointer
    int max = 0;
    Set<Character> set = new HashSet<>();
        while(j < s.length()){
        if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j));
            j++;
            max = Math.max(max,set.size());
        } else{
            set.remove(s.charAt(i));
            i++;
        }
      }
        return max;
   }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingCharacter string = new LongestSubStringWithoutRepeatingCharacter();
        System.out.println(string.lengthOfLongestSubstring("abcabcbbc"));
    }
}
