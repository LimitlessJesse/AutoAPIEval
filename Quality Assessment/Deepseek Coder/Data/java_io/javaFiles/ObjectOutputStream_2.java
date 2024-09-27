import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_2 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] bytes = data.getBytes();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.dat"))) {
            out.write(bytes);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
