import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_8 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeDouble(9.23);
            out.close();
            fileOut.close();
            System.out.println("Double is written to the file successfully");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
