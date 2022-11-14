package com.javapackage;

import java.util.Arrays;
import java.util.List;

public class LambaLocalVariable {
	private static int var=10;
	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(System.out::println);
	
	}

}
