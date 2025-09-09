import java.util.Arrays;

public class QuickSortEx {

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {

            int pivot = getPivot(array, low, high-1);
            quickSort(array, low, pivot);
            quickSort(array, pivot + 1, high-1);
        }
       
    }

    static int getPivot(int[] array, int low, int high) {

        int pivot = array[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (array[i] <= pivot && i <= high-1) {
                i++;
            }
            while (array[j] > pivot && j >= low+1) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] array = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int low = 0;
        int high = array.length;

        System.out.println("Before sorting : ");
        for (int i = 0; i < high; i++) {
            System.out.print(array[i] + " ");
        }
        quickSort(array, low, high);
        //Arrays.sort(array);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < high; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
