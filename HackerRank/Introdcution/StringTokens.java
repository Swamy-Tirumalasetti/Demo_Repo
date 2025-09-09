import java.util.Scanner;

public class StringTokens {
    public static void tokens(String s) {
       //He is a very very good boy, isn't he? s.trim();
        String cleaned = s.replaceAll("[!,?._'@]", "");
        String[] tokens = cleaned.split(" ");
        System.out.println(tokens.length);

        for (String str : tokens)
            System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        tokens(s);
        scan.close();
    }
}
