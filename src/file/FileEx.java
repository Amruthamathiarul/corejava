package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx {
	public static void main(String[] args)throws IOException {
		File f= new File("D:/JAVA/CoreJava8");
			if (f.createNewFile())
			{
				System.out.println("File is Created");
			}
			else
			{
				System.out.println("File already exists");
			}
			Path p= Paths.get("D:/JAVA/CoreJava8");
		    boolean status;
		    status=Files.isReadable(p);
		    System.out.println("File is Readable?" +status);
		    String path=f.getAbsolutePath();
		    System.out.println("Absolute path"+path);
		    String path1=f.getPath();
		    System.out.println("path"+path1);
		    String path2=f.getCanonicalPath();
		    System.out.println("Canonical path"+path2);
		    
		}
	}


		
		
	


