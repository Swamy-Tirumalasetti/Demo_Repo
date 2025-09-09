public class HashingEx {

    //int hash[];
    public static void print(int[] arry, int n) {
        for (int i = 0; i < n; i++) {
            //System.out.println(arry[i]);
        }
        // pre compute
        //int hash[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arry[i]] += 1;
        }

        // fetching
        while (n-- > 0) {
            System.out.print(n +"=");
            System.out.println(hash[n]);
        }
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 1, 4, 5, 2 ,6};
        print(array, array.length);
    }

}