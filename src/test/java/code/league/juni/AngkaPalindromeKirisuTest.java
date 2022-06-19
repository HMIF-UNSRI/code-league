package code.league.juni;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static code.league.juni.AngkaPalindromeKirisu.susunPalindrome;

import org.junit.jupiter.api.Test;

public class AngkaPalindromeKirisuTest {

    @Test
    public void testCase0() {

        int result = susunPalindrome(8, 2, 3);
        assertEquals(2, result);
    }

    @Test
    public void testCase1() {

        int result = susunPalindrome(12, 3, 2);
        assertEquals(4, result);
    }

    @Test
    public void testCase2() {

        int result = susunPalindrome(20, 5, 2);
        assertEquals(5, result);
    }

    @Test
    public void testCase3() {

        int result = susunPalindrome(38, 4, 6);
        assertEquals(4, result);
    }

    @Test
    public void testCase4() {

        int result = susunPalindrome(60, 4, 7);
        assertEquals(17, result);
    }

    @Test
    public void testCase5() {

        int result = susunPalindrome(92, 7, 6);
        assertEquals(42, result);
    }

    @Test
    public void testCase6() {

        int result = susunPalindrome(156, 8, 6);
        assertEquals(1155, result);
    }

    @Test
    public void testCase7() {

        int result = susunPalindrome(178, 7, 9);
        assertEquals(462, result);
    }
}
