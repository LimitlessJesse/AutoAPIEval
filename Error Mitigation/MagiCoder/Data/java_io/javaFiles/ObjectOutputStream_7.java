import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_7 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"))) {
            oos.writeChars("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
