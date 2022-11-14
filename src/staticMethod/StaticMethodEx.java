package staticMethod;
class Learner {
	String name;
	int enrollno;
	static String institute="EDUBRIDGE";
	static void change() 
	{
		institute="EDUBRIDGE";
	}
	public Learner(String name, int enrollno) {
		super();
		this.name = name;
		this.enrollno = enrollno;
	}
	void display()
	{
		System.out.println(enrollno+ ""+name+"" +institute);
	}
}
public class StaticMethodEx {
	public static void main(String[] args) {
		Learner.change();
		Learner s1= new Learner("Amrutha",123);
		Learner s2= new Learner("Maha",456);
		Learner s3= new Learner("Lavanya",789);
		s1.display();
		s2.display();
		s3.display();
			
		
	}
}


