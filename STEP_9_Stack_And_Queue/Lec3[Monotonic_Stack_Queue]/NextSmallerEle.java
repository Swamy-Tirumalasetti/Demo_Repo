import java.util.*;
import java.io.*;

public class NextSmallerEle {

    public static int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                res[stack.pop()] = i;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }

        return res;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 4, 3));// G =
        // [1 -1 3 -1]
        int[] input = { 2, 1, 4, 3 };
        int[] output = nextSmallerElement(input, input.length);
        for (int i : output) {
            System.out.print(i + " ");
        }

    }
}
