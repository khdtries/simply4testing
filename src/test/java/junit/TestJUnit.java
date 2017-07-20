package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {
	@Test
	public void testSetup() {
		String s = "junit test";
		assertEquals("junit test", s);
	}
	
	@Test
	public void testSetup2() {
		String s = "junit test 2";
		assertEquals("junit test 3", s);
	}
}
