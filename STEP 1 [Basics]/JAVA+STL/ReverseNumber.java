public class ReverseNumber {

    public static int reverse(int n) {
        int i = 1;
       
        int totalCount = 0;
        while (i <= n) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + j;
            }
            totalCount = totalCount + count;
            i++;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println("Greatest common divisor of given number is :" + reverse(3));

    }
}
