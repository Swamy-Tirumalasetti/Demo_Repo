import java.util.HashSet;

public class HastSetEx {

    // doesn't have duplicates as list and also can have one null value and maintains order 
    
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Book");
        names.add("Pen");
        names.add("Book");
       // names.add(" ");
       //names.add(null);
        names.add("Sheet");
        for (String string : names) {
            System.out.println(string);
        }
    }
}
