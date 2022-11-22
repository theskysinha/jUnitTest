package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting JUnit = new jUnitTesting();
		String result = JUnit.addStrings("Hello", "World");
		assertEquals("HellowWorld", result);
	}

}
