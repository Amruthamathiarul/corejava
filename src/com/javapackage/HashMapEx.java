package com.javapackage;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
	HashMap<Integer,String> map= new HashMap<>();
	map.put(1,"purple");
	map.put(2,"red");
	map.put(3,"blue");
	map.put(4,"purple");
	System.out.println("Elements in HashMap:" +map);
	if(map.containsValue("blue"))
	{
		System.out.println("blue is present in the element");
	}
	if(!map.containsValue("pink")) {
	      
	      map.put(5,"pink");
	    }

	    System.out.println("Updated HashMap:\n" + map);

	
	}
}
