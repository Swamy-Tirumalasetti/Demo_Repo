import java.util.Arrays;
import java.util.Stack;

public class PrevGreaterEle {

    public static int[] nearestGreaterEle(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            if (stack.empty())
                res[i] = -1;
            else
                res[i] = stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 }; // -1,-1,5,-1,10
        int[] output = nearestGreaterEle(arr);
        System.out.print(Arrays.toString(output));
    }
}
