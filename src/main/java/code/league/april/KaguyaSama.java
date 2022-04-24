package code.league.april;

public class KaguyaSama {
    public static Integer solution(String text) {
        StringBuilder builder = new StringBuilder(text);
        String key = "KAGUYASAMA";
        int result = 0;
        while (true) {
            int res = builder.indexOf(key);
            if (res == -1) {
                break;
            } else {
                result++;
                builder.delete(res, res + key.length());
            }
        }

        return result;
    }
}
