package AdvanceMaths;

public class PrintAllDivisors {
    public static void print_divisors(int n) {
        // for(int i = 1; i<= Math.sqrt(n); i++){// this condition also written as
        int i;
        for (i = 1; i * i < n; i++) {// because Mat.sqt lib fn may take extra time
            if ((n % i) == 0)
                System.out.print(i + " ");
        }
        if (i - (n / i) == 1) {
            i--;
        }
        for (; i >= 1; i--) {
            if ((n % i) == 0)
                System.out.print(n / i + " ");
        }
    }

    public static void main(String[] args) {
        print_divisors(100);
    }
}
