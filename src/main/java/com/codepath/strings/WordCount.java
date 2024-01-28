package com.codepath.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {

		String inputText = "This is a simple word count program. This program counts the occurrences of each word in a text.";

		Arrays.asList(inputText.split(" "))
		.stream()
		.collect(Collectors.groupingBy(s -> s, Collectors.counting()))
				.entrySet()
				.forEach($ -> {
					System.out.println($.getKey() + " - " + $.getValue());
				});

	}

}
