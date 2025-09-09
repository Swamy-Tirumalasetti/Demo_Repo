package AdvanceMaths;

public class CountPrimes {
    public static int countPrimes(int n) {
        // if ((n % 1 == 0) && (n % n == 0))
        // return 1;
        int[] prime = new int[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = 1;

        for (int j = 2; j * j <= n; j++) {
            if (prime[j] == 1) {
                for (int k = j * j; k <= n; k += j)
                    prime[k] = 0;
            }
        }
        int cnt = 0;
        for (int l = 2; l <= n; l++) {
            if (prime[l] == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int output = countPrimes(4);
        System.out.println("Prime count is : " + output);
    }
}
