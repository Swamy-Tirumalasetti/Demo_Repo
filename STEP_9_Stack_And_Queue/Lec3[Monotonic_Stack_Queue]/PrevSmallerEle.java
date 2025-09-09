import java.util.Arrays;
import java.util.Stack;

public class PrevSmallerEle {
    static int[] nearestSmallerEle(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            res[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 }; // -1,4,-1,2,2
        int[] output = nearestSmallerEle(arr);
        System.out.print(Arrays.toString(output));
    }
}