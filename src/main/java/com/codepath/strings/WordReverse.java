package com.codepath.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordReverse {
	
	public static void main(String[] args) {

		// Reverse word

		String message = "peregrine falcon";

		System.out.println(getWordReversed(message));

	}
	
	
	public static String getWordReversed(String input) {
		
		return Arrays.asList(input.split(" "))
				.stream()
				.collect(Collectors.collectingAndThen(
		                Collectors.toList(),
		                list -> {
		                    java.util.Collections.reverse(list);
		                    return list.stream();
		                }
		        ))
				.collect(Collectors.joining(" "));
	}

}
