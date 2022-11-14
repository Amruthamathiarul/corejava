package multipleInheritance;
class Animal implements AnimalEat, AnimalTravel
{
	public void Eat()
	{
		System.out.println("Animal is Eating");
	}
	public void Travel()
	{
		System.out.println("Animal is Travelling");
	}
	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
	}
}
public class MultiInherEx {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.Eat();
		a.Travel();
		
	}

}
