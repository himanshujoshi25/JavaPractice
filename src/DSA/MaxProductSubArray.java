package DSA;
public class MaxProductSubArray {

    public int maxProduct(int[] nums) {

        int length = nums.length;
        if(length == 0) return 0;
        int min = nums[0], max = nums[0], result = nums[0];

        for(int i = 1; i < length; i++){

            int temp_max = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]));
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));
            max = temp_max;
            result = Math.max(result,max);
        }
        return result;
    }

    public static void main(String[] args) {
        MaxProductSubArray product = new MaxProductSubArray();
        System.out.println(product.maxProduct(new int[]{2,3,-2,4}));
    }
}
