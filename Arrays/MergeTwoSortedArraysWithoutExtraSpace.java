import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void merge(long[] a, long[] b) {
        // Write your code here.
        int left = a.length - 1;
        int right = 0;
        while (left > 0 && right < b.length) {
            if (a[left] > b[right]) {
                long temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        long[] arr1 = { 1, 4, 8, 10 };
        long[] arr2 = { 2, 3, 9 };
        long n = arr1.length;
        long m = arr2.length;
        merge(arr1, arr2);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}