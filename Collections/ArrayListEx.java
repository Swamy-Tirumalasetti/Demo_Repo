
import java.util.*;

public class ArrayListEx {
    public static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Yamini");
        list.add("Maha");
        list.add("Chamanthi");
        list.add("Nasreen");
        list.add("Nasreen");

        Iterator<String> iterator = list.iterator();
        // for (String name : list) {
        //     System.out.println(name);

        // }
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
        }
    }
}