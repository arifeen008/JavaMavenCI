package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		//init value
		int score = 80;
		//expected
		String expected = "A";
		//actual
		String actual = "A";
		//test
		Assert.assertEquals(expected, actual);
	}

}
