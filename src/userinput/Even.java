package userinput;

	import java.util.Scanner;
	//import java.util.Scanner;
	
	public class Even {
			public static void main(String[] args) {
			    Scanner sc=new Scanner(System.in);
			
				int x,y;
				System.out.println("Enter value x");
				x=sc.nextInt();
				System.out.println("Enter value y");
			y=sc.nextInt();
			

				if (x%2==0)
				{
					System.out.println("x  is Even");
			}
			else
			{
						System.out.println("x is odd");
			}
				if (y%2==0)
				{
					System.out.println("y  is Even");
			}
			else
			{
						System.out.println("y is odd");
			}
				
			}

		

		}



