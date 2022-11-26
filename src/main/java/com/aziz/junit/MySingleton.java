package com.aziz.junit;

public class MySingleton {

	private static DataSources dataSources;

	private MySingleton() {

	}

	public static synchronized DataSources getInstance() {
		if (dataSources == null) {
			dataSources = new DataSources();
		}
		return dataSources;
	}

}