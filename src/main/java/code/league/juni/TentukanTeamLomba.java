package code.league.juni;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TentukanTeamLomba {

    /*
     * Complete the 'tentukanTeamLomba' function below.
     *
     * The function is expected to return a STRING.
     */

    public static String tentukanTeamLomba(int kelasA, int kelasB, int kelasC) {
        // Write your code here
        if (kelasA >= 3 && kelasA <= 12) {
            if (kelasB >= 3 && kelasB <= 12) {
                if (kelasC >= 3 && kelasC <= 12) {
                    ArrayList<Integer> result = new ArrayList<Integer>(2);

                    // team Matematika (5 orang) syarat: 1 orang kelas A, 2 orang kelas B, 2 orang kelas C.
                    result.add(0, kombinasi(kelasA, 1) * kombinasi(kelasB, 2) * kombinasi(kelasC, 2));

                    // team Kimia (6 orang) syarat : 2 orang kelas A, 3 orang kelas B, 1 orang kelas C.
                    result.add(1, kombinasi(kelasA, 2) * kombinasi(kelasB, 3) * kombinasi(kelasC, 1));

                    return "Matematika: " + result.get(0) + " team\n" +
                            "Kimia: " + result.get(1) + " team";
                }
            }
        }
        return null;
    }

    public static Integer faktorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * faktorial(num - 1);
        }
    }

    public static Integer kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int a = Integer.parseInt(bufferedReader.readLine().trim());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        int c = Integer.parseInt(bufferedReader.readLine().trim());

        String result = TentukanTeamLomba.tentukanTeamLomba(a, b, c);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
