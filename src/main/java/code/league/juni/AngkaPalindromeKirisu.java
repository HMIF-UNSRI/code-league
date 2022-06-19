package code.league.juni;

public class AngkaPalindromeKirisu {

    public static int susunPalindrome(int num, int x, int y) {

        return susunPalindrome(num, x, y, "");
    }

    public static int susunPalindrome(int num, int x, int y, String str) {

        if(num == 0) {
            if(isPalindrom(str)) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(num < Math.min(x, y)) {
            return 0;
        }
        
        String xKey = str + x;
        String yKey = str + y;

        return susunPalindrome(num - x, x, y, xKey) + susunPalindrome(num - y, x, y, yKey);
    }

    public static boolean isPalindrom(String num) {
        
        int j = num.length();

        for(int i = 0; i < num.length() / 2; i++) {

            if(num.charAt(i) != num.charAt(--j))
                return false;
        }

        return true;
    }
}
