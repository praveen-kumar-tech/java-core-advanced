package com.codepath.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AnagramCheck {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		Boolean isAnagram = false;

		if (str1.length() == str2.length()) {
			Map<String, Long> characterMap = getCharacterMap(str1);
			Map<String, Long> characterMap2 = getCharacterMap(str2);

			for (Entry<String, Long> entry : characterMap.entrySet()) {

				if (characterMap2.get(entry.getKey()) == entry.getValue()) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}
			}

		}

		System.out.println((isAnagram ? "Yes Anagram" : "Not a Anagram"));

	}

	public static Map<String, Long> getCharacterMap(String input) {
		return Arrays.asList(input.split(""))
				.stream()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
	}

}
