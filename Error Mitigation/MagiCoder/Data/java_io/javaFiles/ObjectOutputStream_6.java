import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_6 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.dat"))) {
            oos.writeChar(65); // writes the char 'A'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
