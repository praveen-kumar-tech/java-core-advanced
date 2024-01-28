package com.codepath.strings;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CharacterCount {
	
public static void main(String[] args) {
	
	String inputString = "Hello World!";
		
	getCharacterCount(inputString)
	.forEach($-> {
		System.out.println($.getKey() + " " + $.getValue());
	});
		
}

public static Stream<Entry<String, Long>> getCharacterCount(String input) {

	return Arrays.asList(input.split(""))
			.stream()
			.filter(s -> Character.isAlphabetic(s.charAt(0)))
			.collect(Collectors.groupingBy(s -> s, Collectors.counting()))
			.entrySet()
			.stream();
}

}
