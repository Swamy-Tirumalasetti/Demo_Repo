public class RecursionEx {
    private static void recursionEx(int i, int n) {
        if (i > n)
            return;
        System.out.println("Recursion");
        recursionEx(i + 1, n);
    }

    public static void main(String[] args) {
        recursionEx(1, 5);
    }
}
