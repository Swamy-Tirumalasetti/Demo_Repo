
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = find1stOcc(nums, start, end, target);
        int second = findLastOcc(nums, start, end, target);
        int result[] = new int[2];
        result[0] = first;
        result[1] = second;

        return result;
    }

    static int find1stOcc(int[] nums, int start, int end, int target) {
        int ans = -1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }

    static int findLastOcc(int[] nums, int start, int end, int target) {
        int ans = -1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        searchRange(arr, 8);
    }
}