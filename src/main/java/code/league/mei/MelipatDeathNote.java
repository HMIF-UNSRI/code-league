import java.util.Scanner;

public class MelipatDeathNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Memasukkan input dari user
        int p = in.nextInt();
        int q = in.nextInt();
        int m = in.nextInt();

        // Melakukan pengecekan pada panjang dan lebar sebanyak M kali
        // Setelah dilakukan pengecekan, yang terpanjang akan dibagi 2
        while (m > 0) {
            if (p > q) {
                p /= 2;
                m--;
            } else {
                q /= 2;
                m--;
            }
        }

        // Menampilkan hasil perhitungan
        System.out.println(p + " " + q);

        // Menutup Scanner (Opsional)
        in.close();
    }
}
