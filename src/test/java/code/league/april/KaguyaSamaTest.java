package code.league.april;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KaguyaSamaTest {
    @Test
    void test1() {
        String word = "KAGUYASAMA";
        int deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(1, deleted);

        word = "KAGUYASAMKAGUYASAMAA";
        deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(2, deleted);
    }

    @Test
    void test2() {
        String word = "KAGUYASAKAGUYAKAGUYASAMASAMAMA";
        int deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(3, deleted);

        word = "KKAGUKAGUYAKAGUYASAMASAMAYASAMAAGUYASAKAGUYAKAGUYASAMASAMAMA";
        deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(6, deleted);

        word = "KKAGUKAGUYKAGUYASAMAAKAGUYAKAGUKAGUYASAMAYASAMASAMASAMAYASAMAAGUYASAKAGUYAKAGUYASAMASAMAMA";
        deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(9, deleted);

        word = "KKAGUKAGUYKAGUYASAMAAKAGUYKAGUKAGUYASAMAYASAMAASAMAKAGUYAKAGUKAGUYASAMAYASAMASAMASAMAYASAMAAGUYASAKAGUYAKAGUYASAMASAMAMA";
        deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(12, deleted);
    }

    @Test
    void test3() {
        String word = "KAGUYASAMAKAGUYASAMAKAGUYASAMA";
        int deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(3, deleted);

        word = "KAAGUYASAMAA";
        deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(0, deleted);

        word = "AAAAAAAAAAAAAAAAAAA";
        deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(0, deleted);

        word = "KKAAGGUUYYAASSAAMMA";
        deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(0, deleted);
    }

    @Test
    void test4() {
        String word = "KKAKAGUYASAMAAGUYASAMAAGUYASAMA";
        int deleted = KaguyaSama.solution(word);
        Assertions.assertEquals(1, deleted);
    }
}
