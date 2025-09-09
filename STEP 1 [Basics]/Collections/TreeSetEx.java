import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String args[]) {
        // Creating and adding elements
        // maintains alphabeical order, override duplicates and doesn't contains null values
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //set.add(null);
        // traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
