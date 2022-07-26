package code.league.juli;
import java.util.ArrayList;
import java.util.List;

public class AyoBerhitung {

    public static int ayoBerhitung(List<Integer> A, int n) {
        int[] boxs = new int[n];
        for(int i = 0; i < n; i++){
            boxs[i] = A.get(i);
        }
        return root(boxs, 0);
    }

    public static int root(int[] boxs, int pos){
        int sum = 0;
        int[] val = {
            jump(boxs, 0, sum),
            jump(boxs, 1, sum),
            jump(boxs, 2, sum),
            jump(boxs, 3, sum),
            jump(boxs, 4, sum),
            };
        Arrays.sort(val);
        return val[val.length-1];
    }

    public static int jump(int[] boxs, int pos, int sum){
        if(pos >= boxs.length){
            return sum;
        }
        sum+= boxs[pos];
        int[] val = {
            jump(boxs, pos+1, sum),
            jump(boxs, pos+2, sum),
            jump(boxs, pos+3, sum),
            jump(boxs, pos+4, sum),
            jump(boxs, pos+5, sum)};

        Arrays.sort(val);
        return val[val.length-1];
    }
}

