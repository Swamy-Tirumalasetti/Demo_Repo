import java.util.*;

public class MatrixEx {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.
        int[] row = new int[n];
        int[] column = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] ==1 || column[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

// private static void markRow(ArrayList<ArrayList<Integer>> matrix, Integer n,
// Integer m, int i) {
// for (int j = 0; j < m; j++) {
// if (matrix.get(i).get(j) != 0) {
// matrix.get(i).set(j, -1);
// }
// }
// }

// private static void markColumn(ArrayList<ArrayList<Integer>> matrix, Integer
// n, Integer m, int j) {
// for (int i = 0; i < n; i++) {
// if (matrix.get(i).get(j) != 0) {
// matrix.get(i).set(j, -1);
// }
// }
// }