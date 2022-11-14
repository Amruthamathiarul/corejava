package string;

public class StringEx {
	public static void main(String[] args) {
		//string declaration without using new operator
		String a="Cooking";
		System.out.println("String a="+a);
		//String declaration using new operator
		String b=new String("IoT");
		System.out.println("String b="+b);
		//Some String methods
		System.out.println("The length of the String:"+a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println("Character at position 5:"+a.charAt(5));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains("k"));
		
	}

}
