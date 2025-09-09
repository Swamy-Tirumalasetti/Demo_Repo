public class StringEx {

    public static boolean countDigits(String str, int i, int n) {
        if (i < n || str.charAt(i) == str.charAt(n))
            return false;

        countDigits(str, i + 1, n - 1);

        return true;

    }

    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(countDigits(str, 0, str.length() - 1));
    }
}