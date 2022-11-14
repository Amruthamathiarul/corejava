package file;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx{

public static void main(String[] args)throws IOException {
      Employee e=new Employee();
      e.name="Amrutha";
      e.address="Kallakurichi";
      FileOutputStream fo=new FileOutputStream("D://Java//test.txt");
      ObjectOutputStream os=new ObjectOutputStream(fo);
      os.writeObject(e);
      os.close();
      fo.close();
      System.out.println("Serialized data is saved in D://Java//test.txt");
}


}

