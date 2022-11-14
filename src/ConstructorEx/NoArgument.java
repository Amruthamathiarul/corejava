package ConstructorEx;

public class NoArgument {
	int i;
	NoArgument()
	{
		i=63;
		System.out.println("Creating NoArgument");
		System.out.println("i=" +i);
		
	}
    public static void main(String[] agrs) {
    	NoArgument skill= new NoArgument();
    	
    }
}
