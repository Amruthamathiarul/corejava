package file;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("My name is:" +name);
		System.out.println("Enter your age");
		int age= Integer.parseInt(br.readLine());
		System.out.println("My age is:" +age);
		System.out.println("Enter your percent");
		float percent= Float.parseFloat(br.readLine());
		System.out.println("My present is:" +percent);
		
		
	}
 
}
