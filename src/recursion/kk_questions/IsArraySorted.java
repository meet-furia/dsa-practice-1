package recursion.kk_questions;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        boolean res1 = isArraySorted(nums1, 0);
        System.out.println(res1);

        int[] nums2 = {1,2,3,4,6,5,7,8,9};
        boolean res2 = isArraySorted(nums2, 0);
        System.out.println(res2);

    }
    static boolean isArraySorted(int[] nums, int index) {
        if (index == nums.length - 1) {
            return true;
        }
        if (nums[index] < nums[index + 1]) {
            return true && isArraySorted(nums, index + 1);
        }
        else {
            return false && isArraySorted(nums, index);
        }

        //kk method
        //return nums[index] < nums[index + 1] && isArraySorted(nums, index+1)''
    }
}
