package oops;
class Polygon
{
	//method to render a shape
	public void render()
	{
		System.out.println("Rendering polygon..");		
	}
}
class Square extends Polygon
{
	//render square
	public void render()
	{
		System.out.println("Rendering Square..");
	}
}
class Circle extends Polygon
{
	public void render()
	{
		System.out.println("Rendering Circle..");	
	}
}
public class PolymorphismEx {
	public static void main(String[] args) {
		//creating an object of a circle
		//dynamic binding
		Circle c1 = new Circle();
		c1.render();
		// creating object for square
		Square s1 = new Square();
		s1.render();
		//static binding
		Polygon p1 = new Polygon();
		p1.render();
	}
}
