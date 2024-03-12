package binary_search.basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {1,5,8,12,27,34,46,59,87,91,100};
        int res1 = binarySearch(nums1, 60);
        System.out.println(res1);
    }
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
