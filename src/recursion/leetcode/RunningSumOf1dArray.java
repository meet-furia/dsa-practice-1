package recursion.leetcode;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] runningSum = runningSum(nums);
        System.out.println(Arrays.toString(runningSum));
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

}
