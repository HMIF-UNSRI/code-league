package code.league.april;

import java.util.HashMap;
import java.util.Map;

public class DaduKaori {
    public static Integer solution(int[] numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            if (hashMap.containsKey(numbers[i])) {
                hashMap.put(numbers[i], hashMap.get(numbers[i]) + 1);
            } else {
                hashMap.put(numbers[i], 1);
            }
        }

        int point = 0;
        for (Map.Entry<Integer, Integer> set : hashMap.entrySet()) {
            if (set.getValue() >= 3) {
                point += set.getKey() == 1 ? 1000 : set.getKey() * 100;

                if (set.getValue() > 3) {
                    int remainder = set.getValue() - 3;
                    while (remainder != 0) {
                        point += set.getKey() == 1 ? 100 :
                                set.getKey() == 5 ? 50 : 0;
                        remainder--;
                    }
                }
            } else if (set.getKey() == 1 || set.getKey() == 5) {
                point += set.getKey() == 1 ? set.getValue() * 100 : set.getKey() * set.getValue() * 10;
            }
        }

        return point;
    }
}
