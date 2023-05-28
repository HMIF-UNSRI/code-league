public class PenjadwalanMusik {
    public static int findMaximumBeauty(int[] songDurations, int[] songBeauties, int totalTime) {
        // Mendapatkan jumlah penyanyi
        int n = songDurations.length;
        // Matriks dp untuk menyimpan hasil perhitungan
        int[][] dp = new int[n + 1][totalTime + 1];

        // Melakukan perhitungan untuk setiap penyanyi dan waktu yang tersedia
        for (int i = 1; i <= n; i++) {
            int duration = songDurations[i - 1];
            int beauty = songBeauties[i - 1];

            for (int j = 0; j <= totalTime; j++) {
                if (duration <= j) {
                    // Memilih antara mengambil lagu atau tidak mengambil lagu
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - duration] + beauty);
                } else {
                    // Jika durasi lagu melebihi waktu yang tersedia, tidak mengambil lagu tersebut
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Mengembalikan keindahan maksimum yang dapat dicapai
        return dp[n][totalTime];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah penyanyi
        int n = scanner.nextInt();

        // Membaca durasi dan keindahan lagu untuk setiap penyanyi
        int[] songDurations = new int[n];
        int[] songBeauties = new int[n];
        for (int i = 0; i < n - 1; i++) {
            songDurations[i] = scanner.nextInt();
            songBeauties[i] = scanner.nextInt();
        }

        // Membaca batasan waktu
        int totalTime = scanner.nextInt();

        // Memanggil fungsi untuk mencari keindahan maksimum
        int maximumBeauty = findMaximumBeauty(songDurations, songBeauties, totalTime);
        // Mencetak keindahan maksimum
        System.out.println(maximumBeauty);
    }
}