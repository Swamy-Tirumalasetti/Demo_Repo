import java.util.ArrayList;
import java.util.List;

public class CheckISSubsetPresent {
    public static boolean isSubsetPresent(int n, int k, int[] a) {
        // Write your code here
        List<Integer> subset = new ArrayList<>();
        return checkISSubset(0, a, subset, k, 0);
    }

    static boolean checkISSubset(int i, int[] arr, List<Integer> subset, int k, int sum) {
        if (i == arr.length) {
            if (sum == k) {
                return true;
            }
            return false;
        }
        sum += arr[i];
        if (checkISSubset(i + 1, arr, subset, k, sum) == true)
            return true;
        sum -= arr[i];
        if (checkISSubset(i + 1, arr, subset, k, sum) == true)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        boolean res = isSubsetPresent(0, 5, arr);
        System.out.println(res);
    }
}