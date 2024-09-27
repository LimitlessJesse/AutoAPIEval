import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ObjectOutputStream_13 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("filename.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject("Hello, World!");
            out.close();
            fileOut.close();
            System.out.println("Object has been serialized");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
