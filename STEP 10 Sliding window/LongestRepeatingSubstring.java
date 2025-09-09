public class LongestRepeatingSubstring {
    public static int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int l = 0, r = 0, maxFreq = 0, maxLen = 0;
        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);
            if ((r - l + 1) - maxFreq > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}
