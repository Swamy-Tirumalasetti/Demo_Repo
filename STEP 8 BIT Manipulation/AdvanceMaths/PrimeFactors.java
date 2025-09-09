package AdvanceMaths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static int[] findFactors(int N) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if ((N % i) == 0) {
                list.add(i);
                while (N%i == 0) {
                    N /= i;
                }
            }
        }
        if (N != 1)
            list.add(N);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] output = findFactors(100);
        for (int i : output) {
            System.out.print(i +" -> ");
        }
    }
}