public class NumberOfOccurances {
    public static int count(int arr[], int n, int x) {
        // Your code goes here
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1)
            return 0;
        return (ans[1] - ans[0] + 1);

    }

    static int[] firstAndLastPosition(int[] arr, int n, int x) {
        int first = firstOccurance(arr, n, x);
        if (first == -1)
            return new int[] { -1, -1 };
        int last = lastOccurance(arr, n, x);
        return new int[] { first, last };
    }

    static int firstOccurance(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return first;
    }

    static int lastOccurance(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 10, 10, 10, 19 };
        int ans = count(arr, arr.length, 10);
        System.out.println(ans);

    }
}
