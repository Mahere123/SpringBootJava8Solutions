package com.demo.springboot.entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderTest {
  public static void main(String[] args) {
	 Order order1=new Order("order1",Arrays.asList(new String[] {"item1","item2"}));
	 Order order2=new Order("order2",Arrays.asList(new String[] {"item3"}));
	 Order order3=new Order("order3",Arrays.asList(new String[] {"item2"}));
	 Order order4=new Order("order4",Arrays.asList(new String[] {"item1","item2"}));
	 
	 List<Order> orders=Arrays.asList(new Order[] {order1,order2,order3,order4});
	 orders.stream().map(Order::getItems).flatMap(Collection::stream)
	 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			 .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(2)
	     		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new))
	     		.forEach((key,value)->{
	     			System.out.println("Item: " +key+ ", usage count:" +value+",corresponding orders:"
	     					+ orders.stream().filter(e->e.getItems().contains(key)).map(Order::getName).collect(Collectors.toList()));
	     		});
		
	 
	 
			 
	 }
}
