package com.junit.private1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Test;

import com.junit.MySingleton;

public class MySingletinTest {

	@Test
	public void singletonBreacked() throws NoSuchFieldException, SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException,
			CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {
		
		MySingleton singleton = MySingleton.getInstance();
		MySingleton singleton1 = MySingleton.getInstance();
		if (singleton == singleton1) {
			System.out.println("singleton singleton 1 are equal");
		}

		Constructor constructor = MySingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		MySingleton mySingleton = (MySingleton) constructor.newInstance();
		MySingleton singletonmock = mySingleton.getInstance();
		if (mySingleton == singletonmock) {
			System.out.println("singleton constructor.newInstance() are equal");
		}
		//privent singlton using Enum type singleton
		
		
		/* clone the singleton */
		/*MySingleton instance1 = MySingleton.getInstance();
		MySingleton instance2 = (MySingleton) MySingleton.getInstance().clone();
	    System.out.println("instance1 hashCode:- "+ instance1.hashCode());
	    System.out.println("instance2 hashCode:- " + instance2.hashCode());*/ 
	    
	    
		/* serialize from file to object */
	    MySingleton instance3 = MySingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(instance3);
        out.close();
        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        MySingleton instance4 = (MySingleton) in.readObject();
        in.close();
      
        System.out.println("instance1 hashCode:- " + instance3.hashCode());
        System.out.println("instance2 hashCode:- " + instance4.hashCode());
        
        Assert.assertNotEquals(mySingleton, singletonmock);
	}
	/**How do you solve rule breakers?

	It is much safer to do eager initialization
	To prevent deserializing to create new object you may override readResolve() method in your class and throw exception
	To prevent cloning, you may overrride clone() and throw CloneNotSupported exception
	To escape for reflective instantion, we can add check in the constructor and throw exception.
	
	*/
	/*
	 * @Test public void somethingElseIsDoneWithXyzIsSetAsASystemProperty(){
	 * System.setProperty("com.example", "xyz"); MySingleton singleton =
	 * MySingleton.getInstance(); // This will fail because the single instance was
	 * already initalized with abc in the // previous test
	 * assertThat(singleton.getSomething(), is("something else")); }
	 * 
	 * @Test public void
	 * whenTheSingletonIsStartedAndPauseIsInvokedTheStateIsChanged(){ MySingleton
	 * singleton = MySingleton.getInstance(); singleton.pause();
	 * assertThat(singleton.getState(), is("paused")); }
	 * 
	 * @Test public void theNumberOfStateChangesIsTracked(){ MySingleton singleton =
	 * MySingleton.getInstance(); singleton.pause(); singleton.start();
	 * singleton.stop(); // This will fail because the previous test invoked a state
	 * change assertThat(singleton.getNumberOfTimesStateChanged(), is(3)); }
	 */

}
