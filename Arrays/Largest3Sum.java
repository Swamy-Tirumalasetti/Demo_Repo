import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Largest3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hashSet = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (set.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    hashSet.add(temp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> threeSumList = new ArrayList<>(hashSet);
        return threeSumList;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        threeSum(nums);
    }
}
