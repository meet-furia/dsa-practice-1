package sorting.practice1;

import java.util.Arrays;

public class RecursiveInsertionSort {
        public static void main (String[]args){
            int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            int[] sortedArray = recursiveInsertionSort(array, array.length, 0, 0);
            System.out.println(Arrays.toString(sortedArray));

            int[] array1 = {1, 2, 3, 4, 5};
            int[] sortedArray1 = recursiveInsertionSort(array1, array1.length, 0, 0);
            System.out.println(Arrays.toString(sortedArray1));
        }

        static int[] recursiveInsertionSort ( int[] nums, int outer, int inner, int max){
            if (outer == 0) {
                return nums;
            }
            if (inner < outer) {
                if (nums[inner] > nums[max]) {
                    return recursiveInsertionSort(nums, outer, inner+1, inner);
                }
                else {
                    return recursiveInsertionSort(nums, outer, inner+1, max);
                }
            }
            else {
                swap(nums, outer-1, max);
                return recursiveInsertionSort(nums, outer-1, 0, 0);
            }
        }

        static void swap ( int[] nums, int index1, int index2){
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }
}