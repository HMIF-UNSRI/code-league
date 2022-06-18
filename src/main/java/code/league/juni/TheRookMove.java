package code.league.juni;

public class TheRookMove {

    public static String checkRookMove(int n, int[] path) {

        for (int i = 0; i < path.length - 1; i++) {

            int diff = Math.abs(path[i] - path[i + 1]);

            if (!(diff != (n - 1) && diff != (n + 1)))
                return "ILLEGAL";
        }

        return "LEGAL";
    }
}
