package com.javapackage;

import java.util.HashMap;

public class CharacterCount {
	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'a', 'c', 'd', 'c', 'e', 'd','f' };
		HashMap<Character, Integer> m = CharacterCount.countcharacter(a);
		System.out.println(m);
	}

	static HashMap<Character, Integer> countcharacter(char a[]) {
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : a) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else
				m.put(c, 1);
		}
		return m;
	}

}
