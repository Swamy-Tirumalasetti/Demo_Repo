public class Palindrome {
    public static boolean checkPalindrome1(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {

            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (l != r)
                return false;
            else {
                left++;
                right--;
            }

        }
        return true;

    }

    public static boolean checkPalindrome(String s, int i) {
        if (i > s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return checkPalindrome(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(checkPalindrome1(s));
       // System.out.println(checkPalindrome(s, 0));

    }
}
