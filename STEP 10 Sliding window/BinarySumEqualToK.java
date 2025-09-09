public class BinarySumEqualToK {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length, l = 0, r = 0, sum = 0, cnt = 0;
        while (r < n) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            cnt = r - l + 1;
            r++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] input = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(input, 2));
    }
 
}
