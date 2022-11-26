package com.junit.private1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.junit.Emp;
import com.junit.PrivateTest;

public class PrivateTestJunitTest {
	PrivateTest privateTest = Mockito.mock(PrivateTest.class);

	@SuppressWarnings("deprecation")
	@Test
	public void privateMethodtest() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Method method = PrivateTest.class.getDeclaredMethod("addMethod", Integer.class, Integer.class);
		method.setAccessible(true);
		Integer actual = (Integer) method.invoke(privateTest, 10, 1);
		Integer expected = 11;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void privateFiledtest() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Field field = PrivateTest.class.getDeclaredField("emp");
		field.setAccessible(true);
		Emp emp = (Emp) field.get(new PrivateTest(""));
		emp.setName("mohammd");
		
		Field field2 = Emp.class.getDeclaredField("name");
		field2.setAccessible(true);
		String s = (String)field2.get(emp);
		Assert.assertEquals("mohammd", s);
	}

}
