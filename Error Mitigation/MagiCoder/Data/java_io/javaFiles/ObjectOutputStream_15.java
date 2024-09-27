import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_15 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("filename.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeUTF("Hello, World!");
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in filename.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
