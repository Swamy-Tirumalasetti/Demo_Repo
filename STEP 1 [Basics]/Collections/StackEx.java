import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Texas");
        stack.add("Illinious");
        stack.add("Metaphor");
        stack.add("Cheilie");
       // stack.pop();
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
