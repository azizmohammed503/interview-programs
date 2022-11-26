package com.collections;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V> implements Map<K,V>, Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	int SIZE_OF_TABLE = 128;
    HashEntry[] table;
    MyHashMap() {
        table = new HashEntry[SIZE_OF_TABLE];
        for (int i = 0; i < SIZE_OF_TABLE; i++) {
            table[i] = null;
        }
    }

	/* public void put(int key, int value) { 
        int index = hashCodeNew(key);
        System.out.println(index);
        HashEntry hashEntry = new HashEntry(key, value);
        if (table[index] == null) {
            table[index] = hashEntry;
        } else {
            HashEntry runner = table[index];
            while (runner.next != null) {
                if (runner.key == hashEntry.key) {
                    runner.value = hashEntry.value;
                    break;
                } else {
                    runner = runner.next;
                }
            }
            if (runner.next == null) {
                if (runner.key == hashEntry.key) {
                    runner.value = hashEntry.value;
                } else {
                    runner.next = hashEntry;
                }
            }
        }

    }

	/*
	 * public V put(K key, V value) { return putVal(hash(key), key, value, false,
	 * true); } final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
	 * boolean evict) { Node<K,V>[] tab; Node<K,V> p; int n, i; if ((tab = table) ==
	 * null || (n = tab.length) == 0) n = (tab = resize()).length; if ((p = tab[i =
	 * (n - 1) & hash]) == null) tab[i] = newNode(hash, key, value, null); else {
	 * Node<K,V> e; K k; if (p.hash == hash && ((k = p.key) == key || (key != null
	 * && key.equals(k)))) e = p; else if (p instanceof TreeNode) e =
	 * ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value); else { for (int
	 * binCount = 0; ; ++binCount) { if ((e = p.next) == null) { p.next =
	 * newNode(hash, key, value, null); if (binCount >= TREEIFY_THRESHOLD - 1) // -1
	 * for 1st treeifyBin(tab, hash); break; } if (e.hash == hash && ((k = e.key) ==
	 * key || (key != null && key.equals(k)))) break; p = e; } } if (e != null) { //
	 * existing mapping for key V oldValue = e.value; if (!onlyIfAbsent || oldValue
	 * == null) e.value = value; afterNodeAccess(e); return oldValue; } }
	 * ++modCount; if (++size > threshold) resize(); afterNodeInsertion(evict);
	 * return null; } public int get(int key) { int index = hashCodeNew(key); if
	 * (table[index] == null) { return -1; } else { HashEntry runner = table[index];
	 * if (runner.key == key) { return runner.value; } while (runner.next != null) {
	 * if (runner.key == key) { return runner.value; } } return -1; } }
	 * 
	 * public int hashCodeNew(int h) { h ^= (h >>> 20) ^ (h >>> 12); int hashCode =
	 * h ^ (h >>> 7) ^ (h >>> 4); return hashCode % SIZE_OF_TABLE; }
	 */


public static void main(String args[]) {
	
/*	MyHashMap<Integer ,Integer> hashMap = new MyHashMap<>();
    hashMap.put(10, 20);
    hashMap.put(20, 11);
    hashMap.put(21, 1);
    hashMap.put(20, 10);

    int value = hashMap.get(20);
    System.out.println(value);*/
     Map<Integer ,Integer> hashMap = new HashMap<>();
     System.out.println(hashMap.put(11, 3212));
     System.out.println(hashMap.put(11, 232));
}

@Override
public Set<Entry<K, V>> entrySet() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsKey(Object key) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsValue(Object value) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public V get(Object key) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public V put(K key, V value) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public V remove(Object key) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void putAll(Map<? extends K, ? extends V> m) {
	// TODO Auto-generated method stub
	
}

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public Set<K> keySet() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Collection<V> values() {
	// TODO Auto-generated method stub
	return null;
}
}

class HashEntry {
    int key;
    int value;
    HashEntry next = null;

    HashEntry() {
    }

    public HashEntry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return this.key;
    }

    public int getValue() {
        return this.value;
    }
}
