package arrays_and_arraylist.arrays.leetcode;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,71,45,98,32,54,68};
        System.out.println(findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array length must be at least 2");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}