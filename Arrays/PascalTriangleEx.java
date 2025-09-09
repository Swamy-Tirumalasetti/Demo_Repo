
public class PascalTriangleEx {
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] intArray = new int[N][N];
        for (int row = 1; row <= N; row++) {
            intArray[row - 1] = subArray(row);
        }
        return intArray;
    }

    public static int[] subArray(int row) {
        int[] array = new int[row];
        int ans = 1;
        array[0] = 1;
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            array[col] = ans;
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] finalArray = pascalTriangle(5);
        // System.out.println(Arrays.deepToString(finalArray));

        // for (int i = 0; i < finalArray.length; i++) {
        //     for (int j = 0; j < finalArray[i].length; j++) {
        //         System.out.print(finalArray[i][j]);
        //     }
        //     System.out.println("");
        // }

        for (int[] intArr : finalArray) {
            for (int is : intArr) {
                System.out.print(is);
            }
            System.out.println();
        }
    }
}