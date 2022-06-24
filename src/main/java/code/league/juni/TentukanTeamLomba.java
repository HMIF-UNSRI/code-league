package code.league.juni;

import java.util.*;

public class TentukanTeamLomba {

    public static String tentukanTeamLomba(int kelasA, int kelasB, int kelasC) {
        
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
