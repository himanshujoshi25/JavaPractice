package DSA;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                result[0] = i;
                result[1] = map.get(difference);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 6, 10, 14}, 9)));
    }
}
