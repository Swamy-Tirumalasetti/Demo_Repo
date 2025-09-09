public class SelectionSortEx {

    private static void seectionSort(int[] array, int n) {

        // int minEle = array[0];
        for (int i = 0; i < n - 1; i++) {
            int minEle = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minEle]) {
                    minEle = j;
                    // { 13, 46, 24, 52, 20, 9 };
                }
            }
            int temp = array[minEle];
            array[minEle] = array[i];
            array[i] = temp;

            // initial trying
            // if (array[i] > array[j]) {
            // minEle = array[i];
            // array[i] = array[j];
            // array[j] = minEle;
            // }
            // // { 13, 46, 24, 52, 20, 9 };
            // }

            // System.out.println(array[i]);
        }

        System.out.println("After selection sort:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

    }

    public static void main(String[] args) {
        int array[] = { 13, 46, 24, 52, 20, 9 };
        int n = array.length;
        System.out.println("Before Selection sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        seectionSort(array, n);
    }
}