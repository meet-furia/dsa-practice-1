package sorting.practice1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums1 = {125, 25, 65, 78, 48, 65, 65, 12, 5, 3, 1};
        System.out.println(Arrays.toString(nums1));
        insertionSort(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(nums2));
        insertionSort(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(nums3));
        insertionSort(nums3);
        System.out.println(Arrays.toString(nums3));

    }

    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swapNumbers(nums, j, j-1);
                }
            }
        }
    }
    static void swapNumbers(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }



}
