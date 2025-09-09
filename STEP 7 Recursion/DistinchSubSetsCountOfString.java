import java.util.HashSet;
import java.util.Set;

public class DistinchSubSetsCountOfString {

    public static String betterString(String str1, String str2) {
        if (str1.length() == 1 && str2.length() == 1)
            return str1;
        int s1 = countDistinctSubsequences(str1);
        int s2 = countDistinctSubsequences(str2);
        if (s1 >= s2) {
            return str1;
        }
        return str2;
    }

    static int countDistinctSubsequences(String str) {
        Set<String> subsequences = new HashSet<>();
        generateSubsequences(0, str, "", subsequences);
        return subsequences.size();
    }

    static void generateSubsequences(int ind, String str, String current, Set<String> subsequences) {
        // if(i == str.length()){
        subsequences.add(current);
        // return;
        // }
        for (int i = ind; i < str.length(); i++) {
            if (i != ind && str.charAt(i) == str.charAt(i - 1))
                continue;
            current += str.charAt(i);
            generateSubsequences(i + 1, str, current + str.charAt(i), subsequences);
            current.substring(0, current.length() - 1);
            // generateSubsequences(i+1,str,current,subsequences);
        }
    }

    public static void main(String[] args) {
        String str1 = "gboubwd", str2 = "bekoilx";
        String output = betterString(str1,str2);
        System.out.println(output);
    }
}