import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_11 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeInt(123);
            out.close();
            fileOut.close();
            System.out.println("Int is written to the file successfully!");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
