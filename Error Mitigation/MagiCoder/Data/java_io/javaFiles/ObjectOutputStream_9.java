import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class ObjectOutputStream_9 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("filename.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(new MyClass());
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in filename.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
