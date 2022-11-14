package variables;
public class localvariable {

public void StudentAge()
{
	//local variable
	int age=0;
	age=age+20;
	System.out.println("Student age is :"+age);
}

  public static void main(String[] args) {
	  //local variable
	  localvariable temp=new localvariable(); //constructor
	  temp.StudentAge();
	  
}

}
