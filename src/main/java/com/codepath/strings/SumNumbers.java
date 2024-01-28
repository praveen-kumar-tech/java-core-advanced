package com.codepath.strings;

import java.util.Arrays;
import java.util.Optional;

public class SumNumbers {
	public static void main(String[] args) {

		String value = "se12pb45";
		
		getIntegerSum(value).ifPresent(System.out::println);

	}
	
	
	public static Optional<Integer> getIntegerSum(String input) {
		
		return Arrays.asList(input.split(""))
				.stream().filter(s -> Character.isDigit(s.charAt(0)))
				.map(s -> Integer.parseInt(s)).reduce(Integer::sum);
	}
}
