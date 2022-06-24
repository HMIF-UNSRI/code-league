package code.league.june;

public class GobtaDanGobzo {
	public static String solution(int n) {
		boolean ans = true;
		while(n > 0) {
			if(n % 5 == 2 || n % 5 == 3) {
				ans = false;
				break;
			} else if(n % 5 == 4) {
				n = (n+1) / 5;
			} else {
				n /= 5;
			}
		}
		
		if(ans == true) {
			return "DONE GAN";
		} else {
			return "UP GAN";
		}
	}
}
