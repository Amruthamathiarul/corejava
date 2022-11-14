package multipleInheritanceEx;
	class Dog implements Dogbarking, Dogslepping
	{
	public void barking()
	{
	System.out.println("Dog is barking");
	}
	public void slepping()
	{
	System.out.println("Dog is slepping");
	}
	}
	public class multiInheritance {
	public static void main(String[] args) {
	Dog a = new Dog();
	a.barking();
	a.slepping();

	}

	}

