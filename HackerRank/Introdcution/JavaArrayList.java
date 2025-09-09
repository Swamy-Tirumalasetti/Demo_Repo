import java.io.*;
import java.util.*;

public class JavaArrayList {

  public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); 
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            list.add(row);
        }

        // for (List<Integer> row : list) {
        //     System.out.println(row);
        // }
        int q = sc.nextInt();
        for(int i = 0; i< q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
             x = x - 1;
             y = y - 1;
            if (x >= 0 && x < list.size() && y >= 0 && y < list.get(x).size()) 
                System.out.println(list.get(x).get(y));
            else 
               System.out.println("ERROR!");
        }
    }
}