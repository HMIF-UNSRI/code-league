package code.league.juli;

import java.util.ArrayList;
import java.util.List;

public class LordUsop {
	
	public static String lordUsop(String A, List<Integer> B) {
	//membuat array c
        Integer[] C = new Integer[B.size()];
        C = B.toArray(C);
		
		//mencari impostor di A
		int penanda1=0;
		for (int i = 0; i < A.length(); i+=2) {
			int penampung=0;
			if(A.charAt(i)!='0') {
				penampung+=(Character.getNumericValue(A.charAt(i))*10);
				penampung+=Character.getNumericValue(A.charAt(i+1));
			}else {
				penampung+=Character.getNumericValue(A.charAt(i+1));
			}
			int batas=0;
			for (int j = 0; j < C.length; j++) {
				if(penampung==C[j]) {
					batas++;
				}
			}
			
			if(batas==0) {
				penanda1=i;
			}
		}
		
		//mencari impostor di B
		int penanda2=0;
		for (int i = 0; i < C.length; i++) {
			String penampung = "";
			if(C[i]>=10) {
				penampung = String.valueOf(C[i]);
			}else {
				penampung = 0 + String.valueOf(C[i]);
			}
			int batas=0;
			for (int j = 0; j < A.length(); j+=2) {
				String penampung2 ="";
				penampung2+=A.charAt(j);
				penampung2+=A.charAt(j+1);
				
				if(penampung.equals(penampung2)) {
					batas++;
				}
			}
			if(batas==0) {
				penanda2=i;
			}
		}
		
		//ganti password
		String pwBaru="";
		for (int i = 0; i < A.length(); i++) {
			if(i==penanda1) {
				if(C[penanda2]<10) {
					pwBaru+='0';
				}
				pwBaru+=String.valueOf(C[penanda2]);
				i++;
			}else {
				pwBaru+=A.charAt(i);
			}
		}
		return pwBaru;
	}

}
