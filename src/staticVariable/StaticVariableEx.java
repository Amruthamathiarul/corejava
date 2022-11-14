package staticVariable;

class Learner {
	String name;
	int enrollno;
	static String institute="EDUBRIDGE";
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
public class StaticVariableEx {
	public static void main(String[] args) {
		Learner l1= new Learner("Amrutha",123);
		Learner l2= new Learner("Lavanya",456);
		l1.display();
		l2.display();
			
		
	}
}

