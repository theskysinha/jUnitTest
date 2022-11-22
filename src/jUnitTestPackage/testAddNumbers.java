package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting JUnit = new jUnitTesting();
		int result = JUnit.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
