package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

		public static void main(String[] args) {
			ArrayList<String> list= new ArrayList<>();
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
			Iterator<String> itr=list.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }


			
			

		}

		
	}


