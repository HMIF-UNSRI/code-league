package code.league.june;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GobtaDanGobzoTest {

	@Test
	void test1() {
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(1));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(4));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(5));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(6));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(19));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(20));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(21));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(24));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(25));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(26));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(29));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(30));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(31));
	}
	
	@Test
	void test2() {
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(2));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(3));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(7));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(8));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(9));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(10));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(11));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(12));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(13));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(14));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(15));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(16));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(17));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(18));
	}
	
	@Test
	void test3() {
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(129));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(130));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(131));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(74));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(75));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(76));
	}
	
	@Test
	void test4() {
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(121));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(621));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(474));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(419));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(607));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(75));
	}
	
	@Test
	void test5() {
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(3280));
		Assertions.assertEquals("DONE GAN", GobtaDanGobzo.solution(2356));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(752));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(75));
		Assertions.assertEquals("UP GAN", GobtaDanGobzo.solution(2514));
	}

}
