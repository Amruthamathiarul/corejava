package collectionframework;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<>();
		list.add("Dog");
		list.add(0,"Cow");
		list.add(null);
		list.add(1,"Cat");
		list.add("Duck");
		System.out.println("List of elements:"+list);
		System.out.println("get value from list:"+list.get(0));
		System.out.println("set value from list:"+list.set(1, "Cat"));
		System.out.println("Remove element from list:"+list.remove(0));
		System.out.println("List of elements:"+list);
		Iterator<String> i= list.descendingIterator();
		while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }

	}
}
