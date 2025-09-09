public class SearchInARowAndColumnWiseSortedMatrix {
    public static boolean searchElement(int[][] MATRIX, int target) {
        // Write your code here.
        int n = MATRIX.length;
        int m = MATRIX[0].length;
        for (int i = 0; i < n; i++) {
            return checkTargetEle(MATRIX[i], target);
        }
        return false;
    }

    static boolean checkTargetEle(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return true;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 5;
        searchElement(matrix,target);
    }
}
