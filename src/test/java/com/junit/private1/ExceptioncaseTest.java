package com.junit.private1;

import java.util.ArrayList;

import org.junit.Test;

import com.junit.Exceptioncase;

public class ExceptioncaseTest {

	@Test(expected = NullPointerException.class)
	public void ExceptionCaseTest() {
		Exceptioncase exceptioncase = new Exceptioncase();
		exceptioncase.throwExcetion();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		ArrayList emptyList = new ArrayList();
		Object o = emptyList.get(0);
	}

}
