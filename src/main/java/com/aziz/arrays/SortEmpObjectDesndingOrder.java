package com.aziz.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmpObjectDesndingOrder {

	public static void main(String[] args) {

		List<EmpSort> list = new ArrayList<EmpSort>(Arrays.asList(new EmpSort(1, "fris", 50)));
		list.add(new EmpSort(1, "Ram", 50));
		list.add(new EmpSort(2, "Aziz", 96764));
		list.add(new EmpSort(3, "Ram", 6453));
		list.add(new EmpSort(4, "Ram", 5));
		list.add(new EmpSort(5, "Kra", 656));
		list.add(new EmpSort(6, "Anil", 6546547));
		list.add(new EmpSort(7, "Ram", 5));
		System.out.println(list);

		/*
		 * list.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
		 * System.out.println(list);
		 */

		/*
		 * Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		 * System.out.println(list);
		 */

		List<EmpSort> newlist = list.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).collect(Collectors.toList());
		System.out.println(newlist);

		Collections.sort(list, new Comparator<EmpSort>() {
			@Override
			public int compare(final EmpSort object1, final EmpSort object2) {
				/*
				 * Integer i1 =object1.getId(); Integer i2 =object2.getId(); return
				 * i2.compareTo(i1);
				 */
				int value1 = object1.getName().compareTo(object2.getName());
				if (value1 == 0) {
					Integer sal = object1.getSalary();
					int value2 = sal.compareTo(object2.getSalary());
					if (value2 == 0) {
						Integer id = object1.getId();
						return id.compareTo(object2.getId());
					} else {
						return value2;
					}
				}
				return value1;
			}
		});
		System.out.println(list);
		
		
		/* map */
		Map<EmpSort,Integer> map = new HashMap<>();
		map.put(new EmpSort(1, "aziz", 50), 11);
		map.put(new EmpSort(1, "eff", 50), 3);
		map.put(new EmpSort(1, "arrhan", 50), 66);
		map.entrySet().stream()
        .sorted(Map.Entry.<EmpSort, Integer> comparingByKey((e1, e2) -> e1.getName().compareTo(e2.getName()))) 
        .limit(10) 
        .forEach(System.out::println);
		
		map.entrySet().stream()
        .sorted(Map.Entry.<EmpSort, Integer> comparingByValue().reversed()) 
        .limit(10) 
        .forEach(System.out::println);
	}

}
