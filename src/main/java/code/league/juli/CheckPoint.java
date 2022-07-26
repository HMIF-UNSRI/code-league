package code.league.juli;
import java.util.ArrayList;
import java.util.List;

public class CHECKPOINT {
	
    public static String checkPoint(List<Integer> points) {
    	//membuat array
        int[] arr_points = new int[points.size()];
        
        //filter
        int filter_pertandingan = 0;
        int filter_AngMustahil = 0;
        int filter_12 = 1;
        
        for (int i = 0; i < points.size(); i++) {
        	arr_points[i] = points.get(i);
            
        	//Filter 12
            if(arr_points[i]==12) {
            	filter_12--;
            	if(filter_12<0) {
            		return "IMPOSSIBLE";
            	}
            }
            
            //filter Angka Mustahil & Filter Pertandingan 
            filter_AngMustahil = 3;
            while (arr_points[i]>0) {
                if(filter_AngMustahil<=0) {
                    return "IMPOSSIBLE";
                }
                if(arr_points[i]>=4) {
                	filter_pertandingan+=2;
                    arr_points[i]-=4;
                }else {
                	filter_pertandingan++;
                    arr_points[i]--;
                }
                filter_AngMustahil--;
            }
            
        }
        
        if(filter_pertandingan==12) {
            return "POSSIBLE";
        }
        
        return "IMPOSSIBLE";
    }
	}

