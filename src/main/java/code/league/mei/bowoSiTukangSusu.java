import java.util.Scanner;

public class bowoSiTukangSusu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] literBotol = {1, 5, 7, 10};
        int literSusu;
        int hitungBotol = 0;

        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Coba lagi!");
            System.exit(0);
        }
        for(int i = 0;i<n;i++){
            literSusu = sc.nextInt();
            if (literSusu <= 0){
                i--;
                continue;
            }
            while(true){
                if(literSusu == 0){
                    break;
                } else if (literSusu >= literBotol[3]){
                    literSusu -= literBotol[3];
                    hitungBotol++;
                } else if (literSusu >= literBotol[2]){
                    literSusu -= literBotol[2];
                    hitungBotol++;
                } else if (literSusu >= literBotol[1]){
                    literSusu -= literBotol[1];
                    hitungBotol++;
                } else if (literSusu >= literBotol[0]){
                    literSusu -= literBotol[0];
                    hitungBotol++;
                }
            }
            System.out.println(hitungBotol);
            hitungBotol = 0;
        }

    }
}