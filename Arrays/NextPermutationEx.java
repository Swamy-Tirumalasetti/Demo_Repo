import java.util.Arrays;

class NextPermutationEx {
  public static void nextPermutation(int[] nums) {
    int n = nums.length;
    int index = -1;
    for (int i = n - 2; i >= 0; i--) {
      if (nums[i] < nums[i + 1]) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      reverse(nums, 0, n - 1);
      System.out.println(Arrays.toString(nums));
      return;
    }

    for (int i = n - 1; i > index; i--) {
      if (nums[i] > nums[index]) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
        break;
      }
    }

    reverse(nums, index + 1, n-1);
    System.out.println(Arrays.toString(nums));

  }

  private static int[] reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] permutation = { 1,2,3};
    nextPermutation(permutation);
  }
}