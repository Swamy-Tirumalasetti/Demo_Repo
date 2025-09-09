import java.util.Scanner;

public class SubstringComparision {
    public static String getSmallestAndLargest(String s, int k) {
        // String smallest = s.substring(0, k);
        // String largest = s.substring(0, k);
        // for (int i = 1; i <= s.length() - k; i++) {
        // String sub = s.substring(i, i + k);
        // if (sub.compareTo(smallest) < 0) {
        // smallest = sub;
        // }
        // if (sub.compareTo(largest) > 0) {
        // largest = sub;
        // }
        // }
        // return smallest + "\n" + largest;
        // }
        String smallest = "";
        String largest = "";

        int n = s.length() - k + 1;
        String[] subStrings = new String[n];
        for (int i = 0; i < n; i++) {
            subStrings[i] = s.substring(i, i + k);
        }
        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (subStrings[j].compareTo(subStrings[j + 1]) > 0) {
                    String temp = subStrings[j];
                    subStrings[j] = subStrings[j + 1];
                    subStrings[j + 1] = temp;
                }
            }
        }
        return subStrings[0] + "\n" + subStrings[n - 1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}