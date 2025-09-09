public class RecursionEx2 {
    public static void print1To4(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print1To4(i + 1, n);
    }

    public static void print1To4BackTrace(int i, int n) {
        if (i < 1)
            return;
        print1To4BackTrace(i - 1, n); // back tracing
        System.out.println(i);

    }

    public static void main(String[] args) {
        print1To4(1, 4);
        print1To4BackTrace(4, 4);
    }
}
// When print1To4BackTrace(0, 4) returns, it does not print anything because it hits the base case.
// The previous call print1To4BackTrace(1, 4) then prints 1 after the recursive call returns.
// The call print1To4BackTrace(2, 4) prints 2 after its recursive call returns.
// The call print1To4BackTrace(3, 4) prints 3 after its recursive call returns.
// Finally, the initial call print1To4BackTrace(4, 4) prints 4 after its recursive call returns.