import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextSmallerEle1 {
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = A.size();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.empty() && stack.peek() >= A.get(i)) {
                stack.pop();
            }
            if (stack.empty()) {
                list.add(i, -1);
                stack.push(A.get(i));
            } else
                list.add(i, stack.peek());
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 2, 1));// G = [-1, 4, -1, 2, 2]
        ArrayList<Integer> output = prevSmaller(input);
        System.out.println(output.toString());
    }
}
