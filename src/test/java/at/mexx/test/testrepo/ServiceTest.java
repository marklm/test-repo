package at.mexx.test.testrepo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {

	@Test
	public void testFoo() {
		boolean foo = new Service().foo(3 * 60);
		
		assertTrue(foo);
	}

}
