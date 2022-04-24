package code.league.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnyaForgerTest {
    @Test
    void test1() {
        Assertions.assertEquals(6, AnyaForger.solution(10));
        Assertions.assertEquals(0, AnyaForger.solution(13));
    }

    @Test
    void test2() {
        Assertions.assertEquals(30, AnyaForger.solution(5));
        Assertions.assertEquals(6, AnyaForger.solution(10));
        Assertions.assertEquals(3, AnyaForger.solution(11));
        Assertions.assertEquals(1, AnyaForger.solution(12));
    }

    @Test
    void test3() {
        Assertions.assertEquals(21, AnyaForger.solution(7));
        Assertions.assertEquals(15, AnyaForger.solution(8));
        Assertions.assertEquals(10, AnyaForger.solution(9));
        Assertions.assertEquals(0, AnyaForger.solution(0));
    }

    @Test
    void test4() {
        Assertions.assertEquals(36, AnyaForger.solution(2));
        Assertions.assertEquals(35, AnyaForger.solution(3));
        Assertions.assertEquals(33, AnyaForger.solution(4));
        Assertions.assertEquals(30, AnyaForger.solution(5));
    }

    @Test
    void test5() {
        Assertions.assertEquals(36, AnyaForger.solution(2));
        Assertions.assertEquals(35, AnyaForger.solution(3));
        Assertions.assertEquals(33, AnyaForger.solution(4));
        Assertions.assertEquals(30, AnyaForger.solution(5));
        Assertions.assertEquals(36, AnyaForger.solution(2));
        Assertions.assertEquals(35, AnyaForger.solution(3));
        Assertions.assertEquals(33, AnyaForger.solution(4));
        Assertions.assertEquals(30, AnyaForger.solution(5));
        Assertions.assertEquals(36, AnyaForger.solution(2));
        Assertions.assertEquals(35, AnyaForger.solution(3));
        Assertions.assertEquals(33, AnyaForger.solution(4));
    }
}
