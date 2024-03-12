package binary_search.basics;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {1,5,8,12,27,34,46,59,87,91,100};
        int res1 = recursiveBinarySearch(nums1, 60, 0, nums1.length - 1);
        System.out.println(res1);
    }

    static int recursiveBinarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if (target > nums[mid]) {
            return recursiveBinarySearch(nums, target, mid + 1, end);
        } else if (target < nums[mid]) {
            return recursiveBinarySearch(nums, target, start, mid - 1);
        }
        else {
            return mid;
        }
    }
}
