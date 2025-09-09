import java.util.ArrayList;
import java.util.List;

//If ask is to find only one answer then we are returning boolean function if 1st recursive call is true no need to check for 2nd recursive call
//Print ALL (void), Print One (boolean method), Print Count (int)
public class DistinctSubSequences {
    public static int subsets(int[] nums, int k) {
        List<Integer> subset = new ArrayList<>();
        int res = subsetRecur(0, subset, 0, nums, k);
        return res;
    }

    static int subsetRecur(int i, List<Integer> subset, int sum, int[] nums,
            int k) {
        if (i == nums.length) {
            if (sum == k) {
                System.out.print(subset + " ");
                return 1;
            }
            return 0;
        }
        subset.add(nums[i]); // print subsets
        // sum += nums[i];
        int include = subsetRecur(i + 1, subset, sum, nums, k);
        sum += nums[i];
        subset.remove(subset.size() - 1); // print subsets
        // sum -= nums[i];
        int exclude = subsetRecur(i + 1, subset, sum, nums, k);
        return include + exclude;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int subSets = subsets(nums, 2);
        System.out.println(" --> No of subsets equal to given k is : " + subSets);
    }
}
