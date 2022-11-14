package file;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class OutputStreamEx {
	public static void main(String[] args) throws IOException{
		OutputStream a= new FileOutputStream("D:/JAVA/test.txt");
		a.write(65);
		a.write(70);
		a.write(75);
		a.close();
		System.out.println("Successfully created and written in the file:");
		
		
	}

}
