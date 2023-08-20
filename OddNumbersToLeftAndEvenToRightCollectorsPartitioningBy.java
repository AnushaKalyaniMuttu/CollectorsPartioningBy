package com.queue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class OddNumbersToLeftAndEvenToRightCollectorsPartitioningBy {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(5, 2, 9, 12, 7, 4, 6, 3);

	        Map<Boolean, List<Integer>> oddEvenMap = numbers.stream()
	            .collect(Collectors.partitioningBy(num -> num % 2 != 0));

	        List<Integer> rearrangedNumbers = oddEvenMap.get(true);
	        rearrangedNumbers.addAll(oddEvenMap.get(false));

	        rearrangedNumbers.forEach(num -> System.out.print(num + " "));
	}
}
