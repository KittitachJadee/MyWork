import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleMaxTest {

	@Test
	void test() {
		SampleMax comp = new SampleMax();
		assertEquals(-5, comp.findMax(-10, -5));
		assertEquals(-10, comp.findMax(-12,-15)); // assume abnormal case
		assertEquals(30, comp.findMax(10,30));
		assertEquals(20, comp.findMax(20,12));
		assertEquals(3, comp.findMax(3,3));
		assertEquals(-7, comp.findMax(-7,-7));
	}

}
