package sorting.practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {;
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int[] sortedArray = bubbleSort(array);
        System.out.println(Arrays.toString(sortedArray));

        int[] array1 = {1,2,3,4,5};
        int[] sortedArray1 = bubbleSort(array1);
        System.out.println(Arrays.toString(sortedArray1));

    }

    static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    flag = false;
                    swap(nums, j, j+1);
                }
            }
            if (flag) {
                return nums;
            }
        }
        return nums;
    }

    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
