import java.util.Stack;

class GreaterEle2 {
    //grester ele 2 and 1 are same
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];
            int index = i % n;
            while (!stack.empty() && nums[stack.peek()] <= num) {
                stack.pop();
            }
            if (stack.empty())
                nge[index] = -1;
            else
                nge[index] = nums[stack.peek()];
            stack.push(index);
        }
        return nge;

    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 3 };
        int[] output = nextGreaterElements(input);
        for (int i : output) {
            System.out.print(i+" ");
        }
    }

    // Bruteforce App TC & SC = O(N2) & O(N)
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j <= i + n - 1; j++) {
    // int index = j % n;
    // if (nums[index] > nums[i]) {
    // nge[i] = nums[index];
    // break;
    // }
    // nge[i] = -1;
    // }
    // }
    // return nge;
}