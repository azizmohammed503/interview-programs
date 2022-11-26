/*package com.junit.private1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import com.aziz.junit.StaticMethod;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ StaticMethod.class })
public class StaticMethodTest {
	@Test
	public void staticMehodtest() {
		PowerMockito.mockStatic(StaticMethod.class);
		PowerMockito.when(StaticMethod.subMethod(5, 5)).thenReturn(10);
		//StaticMethod staticMethod = new StaticMethod();
		Integer expted = 10;
		Assert.assertEquals(expted, StaticMethod.subMethod(5, 5));
	}
}
*/