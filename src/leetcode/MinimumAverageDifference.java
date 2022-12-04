package leetcode;
public class MinimumAverageDifference {

    public int minimumAverageDifference(int[] nums) {

        int n = nums.length;
        int answer = -1;
        int minDiff = Integer.MAX_VALUE;
        long preSum = 0;
        long totalSum = 0;

        for(int num : nums)
            totalSum += num;

        for(int i = 0; i < n; i++){
            preSum += nums[i];
            long leftAvg = preSum / (i + 1);
            long rightAvg = totalSum - preSum;
            if(i != n - 1){
                rightAvg /= (n - i - 1);
            }

            int currentDiff = (int)Math.abs(leftAvg - rightAvg);

            if(currentDiff < minDiff){
                answer = i;
                minDiff = currentDiff;
            }
        }
        return answer;
    }
}
