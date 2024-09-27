import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_18 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("filename.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in filename.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
