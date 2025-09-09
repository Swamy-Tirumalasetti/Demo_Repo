import static java.util.Collections.*;

public class FebonnaciEX {
    // public static void checkFebonacci(int n) {
    // int i = 1;
    // int a = 0;
    // int b = 1;
    // System.out.print(a);
    // System.out.print(b);
    // while (i < n) {
    // int c = a + b;
    // System.out.print(c);
    // a=b;
    // b=c;
    // i++;
    // }
    // }

    public static int fetbonnaci(int n) {
        if (n <= 1)
            return n;
        int last = fetbonnaci(n - 1);
        int sLast = fetbonnaci(n - 2);
        return last + sLast;
    }

    public static void main(String[] args) {
        // checkFebonacci(5);
        System.out.println(fetbonnaci(4));
    }

}
