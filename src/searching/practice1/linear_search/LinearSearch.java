package searching.practice1.linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,4,7,6,2,12,48,56,74,91};
        System.out.println(searchIndex(arr, 74));
        System.out.println(searchIndex(arr, 75));

    }

    static int searchIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
