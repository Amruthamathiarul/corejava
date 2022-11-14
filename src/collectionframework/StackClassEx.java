package collectionframework;

import java.util.Stack;;

public class StackClassEx {
	public static void main(String[] args) {
		Stack<Integer> a= new Stack<>();
		boolean result= a.empty();
		System.out.println("Is the stack empty?" +result);
		a.push(43);
		a.push(52);
		a.push(29);
		a.push(68);
		System.out.println("Elements in Stack:"+a);
		result= a.empty();
		System.out.println("Is the stack empty?" +result);
			
		
		
	}
}


