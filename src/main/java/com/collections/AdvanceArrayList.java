package com.collections;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class AdvanceArrayList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int size;
	private transient Object[] elementData;

	public AdvanceArrayList(int initialCapacity) {
		super();
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		this.elementData = new Object[initialCapacity];
	}
	
	public AdvanceArrayList() {
		          this(10);
	}
	

	 public boolean add(E e) {
		          ensureCapacity(size + 1);  // Increments modCount!!
		          elementData[size++] = e;
		          return true;
     }

	public boolean remove(Object o) {
		         if (o == null) {
		             for (int index = 0; index < size; index++)
		                 if (elementData[index] == null) {
		                     fastRemove(index);
		                     return true;
		                 }
		         } else {
		             for (int index = 0; index < size; index++)
		                 if (o.equals(elementData[index])) {
		                     fastRemove(index);
		                     return true;
		                 }
		         }
		         return false;
  }
	@Override
	public E get(int index) {
		rangeCheck(index);
		return elementData(index);
	}

	@Override
	public int size() {
		return size;
	}
	private void fastRemove(int index) {
		         int numMoved = size - index - 1;
		         if (numMoved > 0) {
		             System.arraycopy(elementData, index+1, elementData, index,
		                              numMoved);
		         }
		         elementData[--size] = null; // Let gc do its work
     }
	private void rangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException();
	}

	@SuppressWarnings("unchecked")
	E elementData(int index) {
		return (E) elementData[index];
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity) {
			Object oldData[] = elementData;
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			// minCapacity is usually close to size, so this is a win:
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}
	
	public static void main(String[] args) {
		AdvanceArrayList<String> advanceArrayList = new AdvanceArrayList<String>();
		advanceArrayList.add("Aziz");
		advanceArrayList.add("eff");
		System.out.println(advanceArrayList.get(0));
		System.out.println(advanceArrayList.size);
		advanceArrayList.remove("Aziz");
		System.out.println(advanceArrayList.get(0));
		System.out.println(advanceArrayList.size);
	}
	@Override
	public void add(int arg0, E arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
