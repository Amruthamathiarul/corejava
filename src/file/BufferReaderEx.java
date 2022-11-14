package file;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {
	public static void main(String[] args) throws IOException {
	    FileInputStream f= new FileInputStream("D:/JAVA/test.txt");
		BufferedReader br= new BufferedReader(new InputStreamReader(f));
        String line;
        while((line=br.readLine())!=null)
        {
        	System.out.println(line);
        	
        }
}
}