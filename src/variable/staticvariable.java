package variable;
 class Student
 {
	 //static variable
	 public static double fees;
	 public static String name="Amrutha";
  } 
public class staticvariable {
	public static void main(String[] args) {
		Student.fees=9999.99;
		System.out.println(Student.name +"Student fees:"+Student.fees);
		
	}

}
