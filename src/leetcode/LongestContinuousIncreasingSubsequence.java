package leetcode;
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {

        int result = 0;
        int x = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i - 1] >= nums[i])
                x = i;
            result = Math.max(result, i - x + 1);
        }
        return result;
    }
}
