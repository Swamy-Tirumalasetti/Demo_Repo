import java.util.Arrays;

public class BubbleSortEx {

    private static void bubbleSort(int[] array, int n) {
        // int arr[] = { 13, 46, 24, 52, 20, 9 };
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // System.out.println("After bubble sort : ");
        // for (int i = 0; i < n; i++) {
        // System.out.print(array[i] + " ");
        // }
        System.out.println();
        System.out.println("After bubble sort :");
        Arrays.stream(array).forEach(ele -> System.out.print(ele + " "));
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        System.out.println("Before sorting :");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, n);

    }
}
