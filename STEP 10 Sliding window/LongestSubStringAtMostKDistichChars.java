import java.util.HashMap;
import java.util.Map;

public class LongestSubStringAtMostKDistichChars {
    static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, maxLength = 0;
        while (r < s.length()) {
            char currentChar = s.charAt(r);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            while (map.size() > k) { //O(2N)+O(log 256) we can write -- 
                char lch = s.charAt(l);
                map.put(lch, map.get(lch) - 1);
                if (map.get(lch) == 0)
                    map.remove(s.charAt(l));
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
        // if(map.size() > k){ Most optimal App
        //     char lch = s.charAt(l);
        //     map.put(lch, map.get(lch) - 1);
        //     if (map.get(lch) == 0)
        //         map.remove(s.charAt(l));
        //     l++;
        // }else {
        //     maxLength = Math.max(maxLength, r - l + 1);
        //     r++;
        // }
    }

    public static void main(String[] args) {
        String s = "aaabbccd";
        System.out.println(lengthOfLongestSubstringKDistinct(s, 2));
    }
}
