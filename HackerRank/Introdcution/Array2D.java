import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Array2D {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 1, 0, 0, 0, 0),
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 0, 2, 4, 4, 0),
            Arrays.asList(0, 0, 0, 2, 0, 0),
            Arrays.asList(0, 0, 1, 2, 4, 0)
        );
       // List<List<Integer>> arr = new ArrayList<>();

        // IntStream.range(0, 6).forEach(i -> {
        //     try {
        //         arr.add(
        //                 Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                         .map(Integer::parseInt)
        //                         .collect(toList()));
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (sum > max)
                    max = sum;

            }
        }
        System.out.println(max);
       //bufferedReader.close();
    }
}
