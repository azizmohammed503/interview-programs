package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

interface MyCollections{
	
}

interface MyList<T> extends MyCollections{
	void add(T value);

	T get(int index);

	T remove(int index);

	int size();
}

public class MyArrayList<T> implements MyList<T> {
	private Integer initialCapacity = 10;
	private Integer actSize = 0;
	private Object[] objArr;

	public MyArrayList() {
		objArr = new Object[initialCapacity];
	}

	public void add(T value) {
		if (objArr.length - actSize <= 0) {
			increaseListSize();
		}
		objArr[actSize++] = value;
	}

	public T get(int index) {
		return (T) objArr[index];
	}

	public T remove(int index) {
		T obj = (T) objArr[index];
		  System.arraycopy(objArr, index+1, objArr, index, objArr.length - index-1);
		  actSize--;
		return obj;
	}

	public int size() {
		return actSize;
	}

	private void increaseListSize() {
		objArr = Arrays.copyOf(objArr, objArr.length * 3/2+1);
		System.out.println("actSize : " + actSize + " ==>New length: " + objArr.length);
	}

	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<String>();
		
		System.out.println("Size: " + list.size());
		for (int i = 0; i < 10; i++) {
			list.add("Aziz" + i);
		}
		System.out.println("Afrer Add size: " + list.size());
		
		list.remove(1);
		System.out.println("Afrer remove Size: " + list.size());
		
		for (int i = 0; i <  list.size(); i++) {
			System.out.println("get index: " + list.get(i));
		}
		
		
	  
	    
		List myList = (List) new LinkedList();
		//myList.
		ArrayList arrayList = new ArrayList();
		//arrayList.
		/*System.out.println("Size: " + list.size());
		int[] original = new int[10];
		original[0]= 11;
		original[1]= 22;original[2]= 33;original[3]= 44;original[4]= 55;
		int element = 1;
		
		int[] n = new int[original.length - 1];
	    System.arraycopy(original, 0, n, 0, element );
	    System.arraycopy(original, element+1, n, element, original.length - element-1);
	    for (int i = 0; i <  n.length; i++) {
	    	  System.out.println( n[i]);
		}*/
	}
}
