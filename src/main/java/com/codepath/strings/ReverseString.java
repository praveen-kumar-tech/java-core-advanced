package com.codepath.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		
		String value = "peregrine falcon";
				 
		System.out.println(getReversedString(value));
	
	}
	
	public static String getReversedString(String inputString) {
		
		return Stream.of(inputString)
				.map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining());
	}
	
}
