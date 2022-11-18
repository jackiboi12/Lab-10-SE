package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	
	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String answer = junitstring.addStrings("Hello", "World");
		assertEquals("HelloWorld", answer);
	}

}
