package code.league.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KelinciInoriTest {
    @Test
    void test1() {
        Assertions.assertEquals("0H 32M 18S", KelinciInori.solution(720, 850, 70));
    }

    @Test
    void test2() {
        Assertions.assertEquals("3H 21M 49S", KelinciInori.solution(80, 91, 37));
    }

    @Test
    void test3() {
        Assertions.assertEquals("2H 0M 0S", KelinciInori.solution(80, 100, 40));
    }

    @Test
    void test4() {
        Assertions.assertEquals("0H 17M 4S", KelinciInori.solution(720 ,850, 37));
    }

    @Test
    void test5() {
        Assertions.assertEquals("2H 50M 46S", KelinciInori.solution(720 ,850 ,370));
    }

    @Test
    void test6() {
        Assertions.assertEquals(null, KelinciInori.solution(820 ,81, 550));
    }
}
