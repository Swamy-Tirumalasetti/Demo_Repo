import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> majList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int min = (n/3)+1;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) == min) {
                majList.add(nums[i]);
            }
            if (majList.size() == 2)
                break;
        }
        return majList;
    }

    public static void main(String[] args) {
        int[] input = {2,2};
        List<Integer> list = majorityElement(input);
        System.out.println(list.toString());
    }
}

