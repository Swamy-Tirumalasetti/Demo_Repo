import java.util.HashMap;

public class LongestSubArrWithZero {
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (hashMap.containsKey(sum)) {
                    max = Math.max(max, i - hashMap.get(sum));
                } else {
                    hashMap.put(sum, i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 4, -4};
        int ans = getLongestZeroSumSubarrayLength(arr);
        System.out.println(ans);
    }
}
