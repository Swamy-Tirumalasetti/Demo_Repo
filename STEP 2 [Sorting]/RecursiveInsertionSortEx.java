import java.util.Arrays;

public class RecursiveInsertionSortEx {
    static void insertionSort(int[] array, int i, int n) {
        // { 5, 4, 3, 2, 1 };
        if (i == n)
            return;
        int j = i;
        while (j > 0 && array[j] < array[j - 1]) {
            int temp = array[j];
            array[j] = array[j - 1];
            array[j - 1] = temp;
            j--;
        }
        insertionSort(array, i+1, n);
    }

    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1 };
        int n = array.length;

        System.out.println("Before sorting :");
        Arrays.stream(array).forEach(ele -> System.out.print(ele + " "));

        insertionSort(array, 0, n);

        System.out.println("After Insertion sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
