package com.aziz.java8_9_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpression7to8convr {

	public static void main(String[] args) {
		List<Product11> arrList = Arrays.asList(new Product11(1, "Samsung A5", 151700f),
				new Product11(2, "RedmiNote 5", 8456f), new Product11(3, "Backbry C1", 71890f),
				new Product11(4, "Newtisty moti5", 18432f));
		// arrList.add(new Product1(1,"rerSamsung A5",15700f));
		// System.out.println("arrList" +arrList);
		// Print before sort
		System.out.println("------------Print before sort---------");
		printAll(arrList);
		Collections.sort(arrList, new Comparator<Product11>() {
			public int compare(Product11 p1, Product11 p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		// Print after sort
		System.out.println("------------Print after sort---------");
		printAll(arrList);

		// Print below 10000
		System.out.println("------------Print below 10000t---------");
		printBelow10000(arrList);
		
		
		//java 8
		System.out.println("");System.out.println("");
		Collections.sort(arrList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		// Print after sort
		System.out.println("------------8 Print after sort---------");
		printCondisnaly(arrList , p->true, p->System.out.println(p));

		// Print below 10000
		System.out.println("------------ 8 Print below 10000t---------");
		printCondisnaly(arrList , p->p.price<10000, p->System.out.println(p));
	}

	private static void printCondisnaly(List<Product11> arrList, Predicate<Product11> predicate, Consumer consumer) {
		for (Product11 p : arrList) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		} 
		
	}

	private static void printBelow10000(List<Product11> arrList) {
		for (Product11 p : arrList) {
			if (p.price < 10000) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Product11> arrList) {
		for (Product11 p : arrList) {
			System.out.println(p);
		}

	}

}

class Product11 {

	int id;
	String name;
	float price;

	public Product11(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product11 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}