package com.designpatterns.singleton;

public class MySingleton implements Cloneable {
	private static MySingleton singleton = null;

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (singleton == null) {
			synchronized (MySingleton.class) {
				singleton = new MySingleton();
			}
		}
		return singleton;
	}
	public void getMessage(){
		System.out.println("Mysingleton");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

}
