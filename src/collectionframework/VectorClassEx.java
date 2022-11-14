package collectionframework;

import java.util.Vector;;

public class VectorClassEx {
	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		v.add("Amrutha");
		v.add(0,"Maha");
		v.add(1,"Nithya");
		v.add("Lavanya");
		System.out.println("List of elements:"+v);
		System.out.println("get value from list:"+v.get(0));
		System.out.println("set value from list:"+v.set(1,"Nithya"));
		System.out.println("Remove element from list:"+v.remove(0));
		System.out.println("List of elements:"+v);
	}
}



