import java.util.*;

public class QueueUsingStack {

    static class MyQueue {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void pushOptimal(int x) {
            System.out.println("The element pushed is " + x);
            input.push(x);
        }

        //Use when elements are less O(2n) -- pop,peek are easy by thid method
        // public void push(int x) {
        //     while (input.empty() == false) {
        //         output.push(input.pop());
        //     }
        //     input.push(x);
        //     while (output.empty() == false) {
        //         input.push(output.pop());
        //     }
        // }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.pop());
                    // input.pop();
                }

            //int x = output.pop();
            // output.pop();
            return output.pop();
        }

        /** Get the front element. */
        public int peek() {
            // shift input to output
            if (output.empty())
                while (input.empty() == false) {
                    output.push(input.pop());
                    // input.pop();
                }
            return output.peek();
        }

        int size() {
            return (output.size() + input.size());
        }

    }

    public static void main(String args[]) {
        MyQueue q = new MyQueue();
        q.pushOptimal(3);
        q.pushOptimal(4);
        System.out.println("The element poped is " + q.pop());
        q.pushOptimal(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());

    }
}
