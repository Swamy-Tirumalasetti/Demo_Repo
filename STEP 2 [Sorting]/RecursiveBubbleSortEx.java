import java.util.Arrays;

public class RecursiveBubbleSortEx {

    private static void bubbleSort(int[] array, int n) {
        // int arr[] = { 13, 46, 24, 52, 20, 9 };
        if (n == 1)
            return;

        for (int j = 0; j < n - 1; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        bubbleSort(array, n - 1);

        // System.out.println();
        // System.out.println("After bubble sort :");
        // Arrays.stream(array).forEach(ele -> System.out.print(ele + " "));
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        System.out.println("Before sorting :");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, n);

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}