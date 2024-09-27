import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_4 {
    public static void main(String[] args) {
        String filename = "object.dat";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            String message = "Hello, World!";
            out.writeObject(message);
            System.out.println("Object has been written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
