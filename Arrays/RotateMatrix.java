import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class RotateMatrix {
    // public static void rotate(int[][] matrix) {
    // int n = matrix.length;

    // int[][] output = new int[n][n];
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // output[j][n - i - 1] = matrix[i][j];
    // }
    // }
    // // return output;
    // for (int i = 0; i < output.length; i++) {
    // for (int j = 0; j < output.length; j++) {
    // System.out.print(output[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Initialize the output matrix with dimensions m x n
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            output.add(new ArrayList<>(Collections.nCopies(n, 0)));
        }
        // Populate the output matrix by rotating the input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                output.get(j).set(n - 1 - i, mat.get(i).get(j));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(output.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] b =
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        int n = matrix.size();
        int m = matrix.get(0).size();
        rotateMatrix(matrix, n, m);
        // for (int i = 0; i < b.length; i++) {
        // for (int j = 0; j < b.length; j++) {
        // System.out.print(b[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
