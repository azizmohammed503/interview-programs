package com.junit.private1;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.junit.NormalMethod;
public class NormalMethodTest {
	@Test
	public void narmalMethodtest() {
		NormalMethod normalMethod = Mockito.mock(NormalMethod.class);
		Mockito.when(normalMethod.mulMethod(2, 2)).thenReturn(8);
		Integer excpected = 8;
		Assert.assertEquals(excpected, normalMethod.mulMethod(2, 2));
	}
}
