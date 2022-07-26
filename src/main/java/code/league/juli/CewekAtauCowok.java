package code.league.juli;

import java.util.Arrays;
import java.util.HashSet;

public class cewekAtauCowok {
    
    public static String cekGender(String username) {
        
    	// langka pertama
        String new_username = "";
        for (int i = 0; i < username.length(); i++) {
			int penanda=1;
			for (int j = i; j < username.length(); j++) {
				if(j<username.length()-1&&username.charAt(j)==username.charAt(j+1)) {
					penanda++;
					i++;
				}else {
					j+=username.length();
				}
			}if(penanda==1) {
				new_username+=username.charAt(i);
			}
		}  
    	
        //langkah kedua
        HashSet<Character> s = new HashSet<Character>();
        for(int i = 0; i < new_username.length(); i++)
        {
            s.add(new_username.charAt(i));
        }
        
        if(s.size()%2==0) {
        	return "CHAT WITH HER!";
        }
        return "IGNORE HIM!";
    }

}
