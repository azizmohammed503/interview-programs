package com.collections;

import java.util.HashMap;
import java.util.Set;

public class HashcodeEqualsObjectKey {

	public static void main(String a[]) {

		HashMap<Price, String> hm = new HashMap<>();
		// hm.put("AaAa","123");
		// hm.put("BBBB","abc");
		// System.out.println("AaAa".hashCode());
		// System.out.println("BBBB".hashCode());
		// System.out.println(hm.get("AaAa"));

		Price key = new Price();
		key.setItem("Mobile");
		key.setPrice(10000);
		hm.put(key, "Eletranic p");
		 key.setPrice(45345345);

		Price key2 = new Price();
		key2.setItem("Mobile");
		key2.setPrice(10000);
		//hm.put(key2, "Eletranic p");
//        
//        for(int i=0; i<10; i++) {
//        	Price key2 = new Price();
//            key2.setItem("Mobile");
//        	 key2.setPrice(i);
//        	hm.put(key2,"Eletranic p "+i);
//        	System.out.println(i+" itrater "+ key2.hashCode()+""+ hm);
//        }
		System.out.println("obj "+key+"  map " + hm);
		System.out.println("Does key available? " + hm.containsKey(key));
		System.out.println("get key " + key + " val==> " + hm.get(key));

		Price key1 = new Price();
		key1.setItem("Mobile");
		key1.setPrice(10000);
		// System.out.println("get key "+key+ " val==> "+hm.get(key1));

		// System.out.println("AaAa".hashCode());
		// System.out.println("BBBB".hashCode());

		System.out.println("map aftew" + hm);
		// printMap(hm);

	}

	public static void printMap(HashMap<Price, String> map) {

		Set<Price> keys = map.keySet();
		for (Price p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}

class Price {

	private String item;
	private int price;

	public Price() {
	}

	
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return 7;
	}
	 
//    @Override
//    public boolean equals(Object obj) {
//    	if(obj instanceof Price) {
//    		Price p = (Price) obj;
//    		return p.getItem().equals(this.item) && p.getPrice()== this.price;
//    	}
//    	return false;
//    }

	public String getItem() {
		return item;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}


	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "item: " + item + "  price: " + price;
	}
}