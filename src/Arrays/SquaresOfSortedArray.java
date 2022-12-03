package Arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int start = 0, end = n-1, i = n-1;
        while(i>=0){
            if(nums[start]*nums[start] > nums[end]*nums[end]){
                result[i--] = nums[start]*nums[start];
                start++;
            }else{
                result[i--] = nums[end]*nums[end];
                end--;
            }
        }
        return result;
    }
}
