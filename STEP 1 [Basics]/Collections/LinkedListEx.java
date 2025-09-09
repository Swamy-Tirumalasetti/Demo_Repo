import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
//It has no fixed size and can be changed at runtime by allocating and deallocating memory.
//consists of a chain of nodes. Every node has a value and a pointer to the node after it.
    public static void main(String[] args) {
        //same for Vector also
        LinkedList<String> namesList = new LinkedList<>();
        namesList.add("Bharath");
        namesList.add("Ravi");
        namesList.add("Datta");
        namesList.add("Gireesh");
        Iterator iterator = namesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}