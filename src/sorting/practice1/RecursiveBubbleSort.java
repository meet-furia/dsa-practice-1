package sorting.practice1;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int[] sortedArray = recursiveBubbleSort(array, 0, 0);
        System.out.println(Arrays.toString(sortedArray));

        int[] array1 = {1,2,3,4,5};
        int[] sortedArray1 = recursiveBubbleSort(array1,0,0);
        System.out.println(Arrays.toString(sortedArray1));


    }
    static int[] recursiveBubbleSort(int[] nums, int outer, int inner) {
        if (outer == nums.length) {
            return nums;
        }
        if (inner == nums.length - 1 - outer) {
            return recursiveBubbleSort(nums, outer+1, 0);
        }
        if (nums[inner] > nums[inner + 1]) {
            swap(nums, inner, inner+1);
            return recursiveBubbleSort(nums, outer, inner+1);
        }
        else {
            return recursiveBubbleSort(nums, outer, inner+1);
        }
    }
    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
