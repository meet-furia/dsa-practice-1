package arrays_and_arraylist.matrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for (int outer = 0; outer < matrix.length; outer++) {
            for (int inner = 0; inner < matrix[outer].length; inner++) {
                System.out.print(matrix[outer][inner] + " ");
            }
            System.out.println();
        }
    }
}
