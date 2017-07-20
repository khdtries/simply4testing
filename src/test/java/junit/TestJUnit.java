package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {
	@Test
	public void testSetup() {
		String s = "junit test";
		assertEquals("junit test", s);
	}
}
