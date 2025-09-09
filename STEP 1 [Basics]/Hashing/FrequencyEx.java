import java.lang.reflect.Array;

public class FrequencyEx {

    public static void countFrequency(int[] array, int n) {
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (visited[i] == true)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(array[i] + " - " + count);

        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 5, 10, 15, 10, 5 };
        int n = array.length;
        countFrequency(array, n);
    }
}
