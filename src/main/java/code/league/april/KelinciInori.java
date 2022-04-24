package code.league.april;

public class KelinciInori {
    public static String solution(Integer v1, Integer v2, Integer distance) {
        if (v1 > v2) return null;

        int totalSeconds = (3600 * distance) / (v2 - v1);

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds - hours * 3600) / 60;
        int seconds = (totalSeconds - hours * 3600 - minutes * 60);


        return String.format("%dH %dM %dS", hours, minutes, seconds);
    }
}
