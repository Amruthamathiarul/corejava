package loop;
	import java.util.*;

	public class DoWhileLoopEx {

	private static Scanner obj;

	public static void main(String[] args) {
	double a,b,answer;
	int choice,condition;
	obj = new Scanner(System.in);
	do
	{
	System.out.println("Arithmetic calculation");
	System.out.println("press 1 for addition");
	System.out.println("press 2 for subtraction");
	System.out.println("press 3 for multiplication");
	System.out.println("press 4 for division");
	System.out.println("press 5 for finding square root");
	System.out.println("press 0 for exit");
	 
	choice=obj.nextInt();
	System.out.println("enter the choice");

	switch(choice)
	{
	case 1:
	System.out.println("Enter the number for addition");
	a=obj.nextDouble();
	b=obj.nextDouble();
	answer=a+b;
	System.out.println("The sum of the numbers"+answer);
	break;
	case 2:
	System.out.println("Enter the number for subtraction");
	a=obj.nextDouble();
	b=obj.nextDouble();
	answer=a-b;
	System.out.println("The subtraction of the numbers"+answer);
	break;
	case 3:
	System.out.println("Enter the number for multiplication");
	a=obj.nextDouble();
	b=obj.nextDouble();
	answer=a*b;
	System.out.println("The multiplication of the numbers"+answer);
	break;
	case 4:
	System.out.println("Enter the number for division");
	a=obj.nextDouble();
	b=obj.nextDouble();
	answer=a/b;
	System.out.println("The sum is"+answer);
	break;
	case 5:
	System.out.println("Enter the number to find square root");
	a= obj.nextDouble();
	answer=Math.sqrt(a);
	System.out.println("The square root of the number" + a + "is = " +answer);
	break;
	case 6:
	System.exit(0);
	default:
	System.out.println("wrong choice!");

	}
	System.out.println("press 2 for continue or press 0 to exit");
	 condition = obj.nextInt();

	}
	while(condition==2);

	}
	}

