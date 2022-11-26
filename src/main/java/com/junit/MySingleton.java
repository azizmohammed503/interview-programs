package com.junit;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MySingleton implements Serializable, Cloneable {
	// MySingleton enum to unbreak refeliction
	private static MySingleton instance = new MySingleton();

	private MySingleton() {
		// Check if we already have an instance
		if (instance != null) {
			throw new IllegalStateException("Singleton" + " instance already created.");
		}
	}

	public static synchronized MySingleton getInstance() {
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	private Object writeReplace() throws ObjectStreamException {
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public String getSomething() {
		// TODO Auto-generated method stub
		return "breacked singletone";
	}

}

//public static enum SingletonFactory {
enum SingletonFactory {
	INSTANCE;
	public static SingletonFactory getInstance() {
		return INSTANCE;
	}
}
//https://stackoverflow.com/questions/20421920/what-are-the-different-ways-we-can-break-a-singleton-pattern-in-java/20422020