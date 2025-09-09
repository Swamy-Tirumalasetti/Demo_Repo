import static java.util.Collections.*;

public class ReverseArrayEx {

    // print Arrray
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // using iterative
    public static void reverseArray(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // using 3rd var swap also without 3rd var
    static void reverseArray2(int arr[], int n) {
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            // int tmp = arr[p1];
            // arr[p1] = arr[p2];
            // arr[p2] = tmp;
            // p1++;
            // p2--;
            arr[p1] = arr[p1] + arr[p2];
            arr[p2] = arr[p1] - arr[p2];
            arr[p1] = arr[p1] - arr[p2];
            p1++;
            p2--;
        }
        printArray(arr, n);
    }

    // using recursion
    public static void usingRecursion(int[] arr, int i, int n) {
        if (i > n)
            return;
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        usingRecursion(arr, i + 1, n - 1);
    }

    public static void main(String[] args) {
        int[] numArray = {7,6, 5, 4, 3, 2, 1 };
        int[] numArray2 = { 1 ,2,3,4,5};
        int n = numArray.length;
        int i = 0;
        // printArray(numArray, 5);
        // reverseArray(numArray, 5);
         //reverseArray2(numArray2, 5);
        usingRecursion(numArray, 0, n - 1);
        printArray(numArray, n);
    }
}
