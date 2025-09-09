import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class QueueEx {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
      
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Amit Sharma");
        queue.add("Raj");
        // System.out.println("head:" + queue.element());
        // System.out.println("head:" + queue.peek());
        // System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // queue.remove();
        // queue.poll();
        // System.out.println("after removing two elements:");
        // Iterator<String> itr2 = queue.iterator();
        // while (itr2.hasNext()) {
        //     System.out.println(itr2.next());
        // }
    }
    //ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
}