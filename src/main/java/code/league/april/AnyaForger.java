package code.league.april;

public class AnyaForger {
    public static Integer solution(Integer value) {
        if (value < 2 || value > 12){
            return 0;
        }
        int kejadian = 36;
        for(int i = 1; i < value-1; i++){

            if(i > 6){
                kejadian -= 6 - (i%6);
            }else{
                kejadian -= i;
            }

        }
        return kejadian;
    }
}
