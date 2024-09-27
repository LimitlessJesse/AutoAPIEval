import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.txt"));
            out.write(65); // ASCII value of 'A'
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
