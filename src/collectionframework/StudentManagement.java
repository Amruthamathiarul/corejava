package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		String name;
		String age;
		String salary;
		int ch;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to display student");
			System.out.println("Press 3 to Search student");
			System.out.println("Press 4 to delete Student");
			System.out.println("Press 5 to update age");
			System.out.println("Press 6 to exit");
			System.out.println("Enter your choice");
			ch= sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println( "Enter name");
				name = sc.next();
				System.out.println( "Enter age");
				age = sc.next();
				System.out.println( "Enter salary");
				salary = sc.next();
				Student s= new Student();
				s.setAge(age);
				s.setName(name);
				s.setSalary(salary);
				al.add(s);
				System.out.println("Student record added");
				break;
			case 2:
				for(int i=0;i<al.size();i++)
				{
					System.out.println("Student record"+(i+1));
					System.out.println("Student name:"+al.get(i).getName());
					System.out.println("Student age:"+al.get(i).getAge());
					System.out.println("Student salary:"+al.get(i).getSalary());
				}
				break;
			case 3:
				System.out.println("Enter the student name for search:");
				name= sc.next();
				int ii=0;
				for(int i=0; i<al.size();i++) 
				{
					if (al.get(i).getName().contains(name)) {
						System.out.println("Student record"+(++ii));
						System.out.println("Student name:"+al.get(i).getName());
						System.out.println("Student age:"+al.get(i).getAge());
						System.out.println("Student salary:"+al.get(i).getSalary());
				}
				if(ii==0)
				{
					System.out.println("No record found for that search");
				}
				}
				break;
				case 4:
					System.out.println("Enter the student name for delete:");
					name= sc.next();
					int searchI=0;
					for(int i =0; i<al.size();i++) {
						if (al.get(i).getName().contains(name)) {
							System.out.println("Student record"+(++searchI));
							al.remove(i);
						}
					}
				if (searchI==0)
				{
					System.out.println("No record found to delete:");
				}
				else
				{
					System.out.println("Student record has been deleted successfully");
				}
				break;
				case 5:
					System.out.println("Enter the student name to search:");
					name= sc.next();
					System.out.println("Enter the student's age:");
					age=sc.next();
					int search = 0;
					for(int i =0; i<al.size();i++) {
						if (al.get(i).getName().contains(name)) {
							Student s1=al.get(i);
							s1.setAge(age);
							al.set(i, s1);
						
						}
					}
					break;
				case 6:
					System.exit(0);
				default: {
					System.out.println("Invalid choice...Please make a valid choice");
				}
				}
			}
		}
}


			

	

	
							
				
				
							
		
				 
			
		
	


				
		


