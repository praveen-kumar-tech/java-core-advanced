package com.codepath.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
	
	
	public static void main(String[] args) {
		
		 String inputString = "ppooramming";

	        // Call the method to find the first non-repeated character
	        char firstNonRepeatedChar = findFirstNonRepeatedChar(inputString);

	        // Print the result
	        if (firstNonRepeatedChar != '\0') {
	            System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
	        } else {
	            System.out.println("No non-repeated character found.");
	        }
		
		
	}
	
	public static char findFirstNonRepeatedChar(String input) {
        // Create a frequency map using streams
        Map<Character, Long> charFrequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        LinkedHashMap::new,
                        (map, ch) -> map.merge(ch, 1L, Long::sum),
                        LinkedHashMap::putAll
                );

        // Find the first non-repeated character using streams
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> charFrequencyMap.get(ch) == 1)
                .findFirst()
                .orElse('\0');
    }

}
