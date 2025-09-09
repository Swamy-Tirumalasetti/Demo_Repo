import java.util.Stack;

public class NextGreaterEle1 {
   
    //For circular array
    static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2*n - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i%n]) {
                stack.pop();
            }
            if (stack.empty())
                res[i%n] = -1;
            else
                res[i%n] = stack.peek();
            stack.push(arr[i%n]);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] input = { 5, 7, 1, 7, 6, 0 };
        int[] output = nextGreaterElements(input); // 7,-1,7,-1,7,5
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
    //7,-1,7,-1,-1,-1
     //for finding right element not for circular array
    //  for (int i = n - 1; i >= 0; i--) {
    //     while (!stack.empty() && stack.peek() <= arr[i]) {
    //         stack.pop();
    //     }
    //     if (stack.empty())
    //         res[i] = -1;
    //     else
    //         res[i] = stack.peek();
    //     stack.push(arr[i]);
    // }
    // return res;
}
