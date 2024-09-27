import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_3 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.dat"))) {
            oos.write(65); // writes the byte 'A'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
