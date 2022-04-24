package code.league.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaduKaoriTest {
    @Test
    void test1() {
        Assertions.assertEquals(0, DaduKaori.solution(new int[]{2, 2, 3, 4, 6}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(250, DaduKaori.solution(new int[]{5, 1, 3, 4, 1}));
    }

    @Test
    void test3() {
        Assertions.assertEquals(1100, DaduKaori.solution(new int[]{1, 1, 1, 3, 1}));
    }

    @Test
    void test4() {
        Assertions.assertEquals(450, DaduKaori.solution(new int[]{2, 4, 4, 5, 4}));
    }

    @Test
    void test5() {
        Assertions.assertEquals(100, DaduKaori.solution(new int[]{1, 2, 3, 4, 6}));
    }

    @Test
    void test6() {
        Assertions.assertEquals(1150, DaduKaori.solution(new int[]{1, 1, 1, 5, 1}));
    }

    @Test
    void test7() {
        Assertions.assertEquals(700, DaduKaori.solution(new int[]{6, 6, 6, 6, 1}));
    }

    @Test
    void test8() {
        Assertions.assertEquals(1200, DaduKaori.solution(new int[]{1, 1, 1, 1, 1}));
    }
}
