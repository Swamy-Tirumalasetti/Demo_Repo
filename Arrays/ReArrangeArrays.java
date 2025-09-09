import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReArrangeArrays {
    public static int[] rearrangeArray(int[] nums) {
        // List<Integer> list =
        // Arrays.stream(nums).boxed().collect(Collectors.toList());
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele : nums) {
            list.add(ele);
        }
        return reArrangeList(list);
    }

    private static int[] reArrangeList(ArrayList<Integer> list) {
        int n = list.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < n; i++) {
            if (list.get(i) < 0) {
                ans.set(neg, list.get(i));
                neg += 2;
            } else {
                ans.set(pos, list.get(i));
                pos += 2;
            }
        }
        int temp[] = new int[ans.size()];
        for(int i =0;i<n;i++){
            temp[i] = ans.get(i);
        }
        //temp = ans.stream().mapToInt(Integer::intValue).toArray();
        return temp;
    }

    public static void main(String[] args) {
        int[] input = { 3, 1, -2, -5, 2, -4 };
        int[] ans = rearrangeArray(input);

         System.out.println(Arrays.toString(ans));

      //  Arrays.stream(ans).forEach(ele -> System.out.print(ele+ " ")) ;
       // Arrays.stream(ans).forEach(System.out::print);

        // for (int value : ans) {
        // System.out.print(value+ " ");
        // }

        // for (int i = 0; i < ans.length; i++) {
        //     System.out.print(ans[i]+ " ");
        // }
    }
}