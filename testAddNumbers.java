package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int sum = junit.addNumbers(100, 22);
		assertEquals(90, sum);
	}

}
