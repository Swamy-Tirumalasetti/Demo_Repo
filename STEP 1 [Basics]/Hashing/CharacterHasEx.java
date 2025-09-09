public class CharacterHasEx {

    public static void main(String[] args) {
        String str = "qabplqasb";
        int n = str.length()-1;
        int[] haString = new int[26];

        while (n >= 0) {
            int ascii = (int) str.charAt(n);
           int store = ascii - 'a';  //for capital letters it's ascii - 'A'
            haString[store] += 1;
            //haString[ascii - 'a']+=1;
            System.out.print(str.charAt(n)+" is present ");
            System.out.println(haString[n]+" times");
            n--;
        }

    }
}
