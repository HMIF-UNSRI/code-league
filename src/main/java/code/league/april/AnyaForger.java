package code.league.april;

public class AnyaForger {
    public static Integer solution(Integer value) {
        int kejadian = 0;

        switch (value) {
            case 2:
                kejadian += 1;
            case 3:
                kejadian += 2;
            case 4:
                kejadian += 3;
            case 5:
                kejadian += 4;
            case 6:
                kejadian += 5;
            case 7:
                kejadian += 6;
            case 8:
                kejadian += 5;
            case 9:
                kejadian += 4;
            case 10:
                kejadian += 3;
            case 11:
                kejadian += 2;
            case 12:
                kejadian += 1;
                break;
            default:
                return 0;
        }

        return kejadian;
    }
}
