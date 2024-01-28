package com.codepath.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckPalindrome {

	public static void main(String[] args) {

		String inputString = "RACECAR";

		System.out.print(inputString + " is " + (isPalidrome(inputString) ? "palidrome" : "not a palidrome"));

	}

	public static Boolean isPalidrome(String input) {
		return Stream.of(input)
				.map(s -> new StringBuilder(s).reverse())
				.collect(Collectors.joining(""))
				.equalsIgnoreCase(input);

	}

}
