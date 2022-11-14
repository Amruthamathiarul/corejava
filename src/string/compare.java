package string;

public class compare {
	public static void main(String[] args) {
		String str="Java"; //str is a reference variable
		String str1= new String("Java"); //str1 is an object/instance of a class
		String str2= new String("Java");
		
		//by using == or equals()
		if(str==str1)
			System.out.println("both values are equals");
		else
			System.out.println("both values are not equals");
		
		if(str.equals(str1))
			System.out.println("both values are equals");
		else
			System.out.println("both values are not equals");
		
			
	}

}
