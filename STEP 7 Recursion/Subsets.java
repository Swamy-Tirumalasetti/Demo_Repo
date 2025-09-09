import java.util.ArrayList;
import java.util.List;

public class Subsets {
    // public static List<List<Integer>> subsets(int[] nums) {
    // List<Integer> subset = new ArrayList<>();
    // List<List<Integer>> res = new ArrayList<>();
    // subsetRecur(0, nums, res, subset);
    // return res;
    // }

    // static void subsetRecur(int i, int[] nums, List<List<Integer>> res,
    // List<Integer> subset) {
    // if (i == nums.length) {
    // System.out.print(subset + " ");
    // res.add(new ArrayList<>(subset));
    // return;
    // }
    // subset.add(nums[i]);
    // subsetRecur(i + 1, nums, res, subset);
    // subset.remove(subset.size() - 1);
    // subsetRecur(i + 1, nums, res, subset);
    // }
    public static String subsets(String s) {
        String f = "";
        subsetRecur(0, s, f);
        return s;
    }

    static void subsetRecur(int i, String s, String f) {
        if (i == s.length()) {
            System.out.print(f+" ");
            return;
        }
        subsetRecur(i + 1, s, f + s.charAt(i));
        subsetRecur(i + 1, s, f);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        // List<List<Integer>> subSets = subsets(nums);
        String s = "abc";
        String subSets = subsets(s);
        // for(List<Integer> list : subSets){
        // System.out.print(list+ " ");
        // }
    }
}
