package loop;

//abstract class
abstract class Animal
{
	//abstract method
	public abstract void animalSound();
	//Regular method
	public void sleep() {
	}
	{
		System.out.println("ZZZzz");
	}
}
//subclass (inherit from Animal)
class Pig extends Animal
{
	public void animalSound() {
	}
	{
		//the body of animal sound
		System.out.println("The pig say:wee wee");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
	Pig obj=new Pig();
	obj.sleep();

	}

}



