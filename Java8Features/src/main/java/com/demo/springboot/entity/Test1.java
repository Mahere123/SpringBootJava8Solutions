package com.demo.springboot.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] int2=new Integer[] {1,6,7,8,9,9};
        Integer[] int3=new Integer[] {8,9,10};
        
        Stream<Integer> Streamresult=Stream.concat(Stream.of(int2),Stream.of(int3));
        List<Integer> result=new ArrayList<>();
        Streamresult.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        		.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue())
        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new))
                .forEach((key,value)->{for(int i=0;i<value;i++) { result.add(key);}
                });
      
               System.out.println(result);
        
      }

}
