package com.core;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Address{
	private String location;
	Address(String location){
		this.location=  location;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + "]";
	}
}
// An immutable class
final class Emplyee {
	private final String name;
	private final int regNo;
	private final Map<String, String> metadata;
	private final List<Address> address;

	public Emplyee(String name, int regNo, Map<String, String> metadata, List<Address> address) {
		this.name = name;
		this.regNo = regNo;
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata = tempMap;
		
		 List<Address> addressdumy= new ArrayList<>(address);
		 
		this.address = addressdumy;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Map<String, String> getMetadata() {
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
	public List<Address> getAddress() {
		List<Address> addressdumy= new ArrayList<>(this.address);
		return addressdumy;
	}
}

// Driver class
public class ImmutableClassTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException,
	IllegalArgumentException, IllegalAccessException {
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
	    List<Address> addressList= new ArrayList<>();
	    addressList.add(new Address("Hyderbad"));
		Emplyee emp = new Emplyee("ABC1", 101, map, addressList);
		
		
		
		Field field = Emplyee.class.getDeclaredField("address");
		field.setAccessible(true);
		List<Address> addres = (List<Address>) field.get(new Emplyee("ABC2", 101, map, addressList));
		addres.add(new Address("New aji"));
		System.out.println(addres);
		
		
		
		System.out.println(emp.getName());
		System.out.println(emp.getRegNo());
		System.out.println(emp.getMetadata());
		map.put("3", "third");
		System.out.println(emp.getMetadata()); // Remains unchanged due to deep copy in constructor

		emp.getMetadata().put("4", "fourth");
		System.out.println(emp.getMetadata()); // Remains unchanged due to deep copy in getter
		System.out.println(emp.getAddress());
		emp.getAddress().add(new Address("new  fgfgfg"));
		System.out.println(emp.getAddress());
	}
}
