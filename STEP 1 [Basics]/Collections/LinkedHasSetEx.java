import java.util.LinkedHashSet;


public class LinkedHasSetEx {

    // it can have null and empty values and order of elements
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet();
        names.add("Book");
        names.add("Pen");
        names.add("Book");
        // names.add(" ");
        //\\ names.add(null);
        names.add("Sheet");
        for (String string : names) {
            System.out.println(string);
        }
    }
}
