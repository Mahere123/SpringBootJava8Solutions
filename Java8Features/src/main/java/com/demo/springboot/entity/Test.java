package com.demo.springboot.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer[] int1=new Integer[] {1,2,5,4,5};
      List<Integer> result1=new ArrayList<>();
      Stream.of(int1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
      .entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue())
     .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new))
     .forEach((key,value) ->{
    	 for(int i=0;i<value;i++) { result1.add(key);}
     });
     System.out.println(result1);
     }
}

