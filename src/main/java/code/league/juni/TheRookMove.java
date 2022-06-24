package code.league.juni;

public class TheRookMove {

    public static String checkRookMove(int n, int[] path) {

        // Iterasi ke seluruh elemen array path
        for (int i = 0; i < path.length - 1; i++) {

            /*
             * Hitung nilai mutlak dari selisih
             * setiap langkah dalam array path
             */
            int diff = Math.abs(path[i] - path[i + 1]);

            // Periksa menurut pola yang telah dijelaskan di file README.md
            if (!(diff != (n - 1) && diff != (n + 1)))
                return "ILLEGAL";
        }

        return "LEGAL";
    }
}
