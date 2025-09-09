public class FindKInRotatedArray {

    public static int findKRotation(int[] arr) {
        // Write your code here.
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                break;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1 };
        int ans = findKRotation(arr);
    }
}