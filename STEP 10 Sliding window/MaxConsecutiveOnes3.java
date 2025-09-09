class MaxConsecutiveOnes3 {
    public static int longestOnes(int[] nums, int k) {
        int maxLength = 0, len = 0, zeros = 0, l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] == 0)
                zeros++;
            if (zeros <= k) {
                len = r - l + 1;
                maxLength = Math.max(maxLength, len);
            } else {
                if(nums[l]==0)zeros--;
                l++;
            }
            r++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] input = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println(longestOnes(input, 2));

    }
    // Optimal app TC : O(2n) 179ms
    // int maxLength = 0, len = 0, zeros = 0, l = 0, r = 0;
    // while (r < nums.length) {
    // if (nums[r] == 0)
    // zeros++;
    // while (zeros > k) {
    // if (nums[l] == 0)
    // zeros--;
    // l++;
    // }
    // if (zeros <= k) {
    // len = r - l + 1;
    // maxLength = Math.max(maxLength, len);
    // }
    // r++;
    // }
    // return maxLength;
}