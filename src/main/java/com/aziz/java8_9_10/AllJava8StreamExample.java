package com.aziz.java8_9_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ProductTest {
	public float getPrice() {
		return price;
	}

	int id;
	String name;
	float price;

	public ProductTest(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductTest [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class AllJava8StreamExample {
	public static void main(String[] args) {

		String s = "44";
		Optional<String> op = Optional.of(s);
		String sp = op.get();
		System.out.println(sp);
		List<ProductTest> productsList = new ArrayList<ProductTest>();
		// Adding Products
		productsList.add(new ProductTest(1, "HP Laptop", 25000f));
		productsList.add(new ProductTest(2, "Dell Laptop", 30000f));
		productsList.add(new ProductTest(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductTest(4, "Sony Laptop", 28000f));
		productsList.add(new ProductTest(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = new ArrayList<Float>();
		for (ProductTest product : productsList) {
			// filtering data of list
			if (product.price < 30000) {
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}

		/* Map */
		List<String> numbers = Arrays.asList("Aziz", "z", "2", "ghgfhg", "thj", "cdf3", "5");
		// get list of unique squares
		List<String> squaresList = numbers.stream().map(i -> i).sorted().collect(Collectors.toList());
		System.out.println(squaresList);
		System.out.println("");
		 
		/* reduce */
		int[] numbersArray = { 10, 1,2, 13, 4, 5, 6, 7, 8, 9, 10 };
		Arrays.stream(numbersArray).sorted().forEach(n->System.out.println(n));
		// 1st argument, init value = 0
		int tsum = Arrays.stream(numbersArray).reduce(0, (a, b) -> a + b);
		System.out.println("sum :::: " + tsum); // 55
		System.out.println("");
		String[] strings = { "a", "b", "c", "d", "e" };
		// |a|b|c|d|e , the initial | join is not what we want
		String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
		// a|b|c|d|e, filter the initial "" empty string
		String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
			if (!"".equals(a)) {
				return a + "|" + b;
			} else {
				return b;
			}
		});
		System.out.println("reduce2 ::: " + reduce2);
		System.out.println("");

		/* Filtering */
		// displaying data
		// Filtering Collection by using Stream
		List<ProductTest> pro1 = productsList.stream().filter((p) -> p.price >= 30000)// filtering data
				.collect(Collectors.toList()); // collecting as list
		System.out.println("filter: : ::: " + pro1);
		System.out.println("");
		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price < 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println("map: : ::: " + productPriceList2);
		System.out.println("");
		
		// Stream Iterating Example
		System.out.println("");
		Stream.iterate(1, element -> element + 1).filter(element -> element % 2== 1).limit(15)
				.forEach(System.out::print);
		System.out.println("");
		//IntStream.range(0, 100).filter(n -> n % 2 == 0).limit(10).forEach(n -> System.out.print(n));
		Stream.iterate(1, f -> f + 1).filter(n -> n % 2 == 0).limit(10).forEach(n -> System.out.print(n));
		// Filtering and Iterating Collection
		System.out.println("");
		productsList.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.print(product.name));
		System.out.println("");
		
		// reduce() Method in Collection
		// This is more compact approach for filtering data
		System.out.println("Sum of price reduce::::::::::");
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,(sum, price) -> sum + price);
		System.out.println(totalPrice);
		System.out.println("");
		
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); // accumulating																								
		System.out.println(totalPrice2);
		System.out.println("");
		
		// Sum by using Collectors Methods
		// Using Collectors's method to sum the prices.
		System.out.println("price Collectors.summingDouble");
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);
		System.out.println("");

		// Find Max and Min Product Price
		// max() method to get max Product price
		System.out.println("");
		ProductTest productA = productsList.stream()
				.max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println("max: : ::: " + productA.price);
		System.out.println("");

		// min() method to get min Product price
		ProductTest productB = productsList.stream()
				.min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println("min: : ::: " + productB.price);
		
		// count() Method in Collection
		System.out.println("");
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println("count: : ::: " + count);
		System.out.println("");

		// Convert List into Set
		// Converting product List into Set
		System.out.println("");
		Set<Float> productPriceList1 = productsList.stream().filter(product -> product.price < 30000) // filter product
				.map(product -> product.price).collect(Collectors.toSet()); // collect it as Set(remove duplicate //// elements)
		System.out.println("conver to Set: : ::: " + productPriceList1);
		System.out.println("");
		
		// Converting Product List into a Map
		java.util.Map<Object, Object> productPriceMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println("conver to Map: : ::: " + productPriceMap);
		System.out.println("");
		
		// Method Reference in stream
		List<Float> productList = productsList.stream().filter(p -> p.price > 30000) // filtering data
				.map(ProductTest::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);
		System.out.println("");
		

		Map<Object, Object> map = productsList.stream().filter(p -> p.name.startsWith("HP"))
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(map);
		System.out.println("");

		ProductTest f = productsList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(f);
		System.out.println("");
		
		String str = "Aziz is java to pasr";
		String reversed = Arrays.asList(str.split(" ")).stream().map(m -> new StringBuilder(m).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(reversed);
		System.out.println("");

		/* distinct */
		List<Integer> list = new ArrayList<>(Arrays.asList(23, 323, 3, 45, 78, 7, 12, 0, 7, 2, 2, 2, 2, 23));
		List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list1);
		System.out.println("");

		List<Integer> listtwo = new ArrayList<>(Arrays.asList(23, 323, 3, 45, 78, 7, 12, 0, 7, 2, 2, 2, 2, 23));
		List<Integer> listOneList = list.stream()
				// We select any elements such that in the stream of elements from the second
				// list
				.filter(one -> listtwo.stream()
						// there is an element that has the same name and school as this element,
						.anyMatch(two -> two.equals(two)))
				// and collect all matching elements from the first list into a new list.
				.collect(Collectors.toList());
		System.out.println(listOneList);
		System.out.println("");

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		System.out.println("");
		
		productsList.add(new ProductTest(1, "HP Laptop", 25000f));
		Map<ProductTest, List<ProductTest>> val = productsList.stream().collect(Collectors.groupingBy(Function.identity()));
		System.out.println(val);
		System.out.println("");
		
		
		
		
		/* Interview Program */
		/*
		 * 1)Multipy and sum the given array
		 */
		List<Integer> multiArray = new ArrayList<>(Arrays.asList(23, 323, 3, 45, 78, 7, 12, 0, 7, 2, 2, 2, 2, 23));
		Integer multiArrayRes = multiArray.stream().reduce(0, (sum,n)->n+sum);
		Integer multiArrayRes1 = multiArray.stream().map(n->n*n).reduce(0, (sum,n)->n+sum);
		System.out.println(multiArrayRes);
		System.out.println(multiArrayRes1);
		System.out.println("");
	}
}