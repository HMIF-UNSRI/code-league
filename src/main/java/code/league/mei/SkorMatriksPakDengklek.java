import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'SkorMatriksPakDengklek' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY genshin as parameter.
     */

    public static int SkorMatriksPakDengklek(List<List<Integer>> genshin) {
        // Fungsi penyelesaian
        int score = 0;
        
        // melakukan sorting pada tiap nilai pada matriks genshin
        for (int i = 0; i < genshin.size(); i++){
            Collections.sort(genshin.get(i));
        }
        
        // melakukan iterasi pada matriks yang telah tersorting 
        for (int i = 0; i < genshin.get(0).size(); i++) {
            int maxi = 0;
            for (int j = 0; j < genshin.size(); j++) {
                maxi = Math.max(genshin.get(j).get(i), maxi);
            }
            // menambah nilai score dengan nilai maksimum 
            score += maxi;
        }
        
        return score;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> genshin = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                genshin.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.SkorMatriksPakDengklek(genshin);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}