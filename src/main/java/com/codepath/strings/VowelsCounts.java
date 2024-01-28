package com.codepath.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsCounts {
	
	public static void main(String[] args) {
		
		String empName = "The peregrine falcon";
			
		getVolwesCounts(empName).entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach($-> {
			System.out.println("key : "+ $.getKey() + " Count :" + $.getValue());
		});

	}
	
	
	public static Map<String, Long> getVolwesCounts(String value)
	{
		return Arrays.asList(value.split(""))
				.stream()
				.filter(s -> Arrays.asList("a" ,"e","i","o","u").contains(s))
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
	}

}
