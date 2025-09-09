import java.util.Scanner;

public class StringHashStrivers {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        String s = "abcdacf";
        // s = sc.next();

        // precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // q = sc.nextInt();
        char[] cArray = { 'a', 'b', 'e', 'f' };
        int q = cArray.length;
        while (q > 0)
            for (char c : cArray) {
                //System.out.println(hash[c - 'a']);
                c++;
                q--;
            }
        // c = sc.next().charAt(0);
        // fetch:
checkChar();
    }

        public static void checkChar() {
            String s = "abcAaB?f";
            int[] hash = new int[256];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i)]++;
            }
            char[] cArray = { 'a', 'A', 'b', '?' };
            int q = cArray.length;
            while (q > 0)
                for (char c : cArray) {
                    System.out.println(hash[c]);
                    c++;
                    q--;
                }
        }
}
