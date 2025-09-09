import java.util.Arrays;

public class LongestConsequtiveSequence {

    public static int longestSuccessiveElements(int[] a) {
        Arrays.sort(a);
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        int logest = 1;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] - 1) == lastSmaller) {
                lastSmaller = a[i];
                count += 1;
            } else if (a[i] != lastSmaller) {
                count = 1;
                lastSmaller = a[i];
            }
            logest = Math.max(logest, count);
        }
        return logest;
    }

    public static void main(String[] args) {

        int[] a = { 5, 8, 3, 2, 1, 4 };
        int output = longestSuccessiveElements(a);
        System.out.println(output);
    }
}