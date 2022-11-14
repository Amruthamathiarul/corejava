package file;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
    Employee e=null;
    FileInputStream fo=new FileInputStream("D://Java//test.txt");
    ObjectInputStream os=new ObjectInputStream(fo);
    e=(Employee)os.readObject();
    os.close();
    System.out.println("Employee class not found");
    System.out.println("Deserialized Employee...");
    System.out.println("name:"+e.name);
    System.out.println("address:"+e.address);
    }
}

