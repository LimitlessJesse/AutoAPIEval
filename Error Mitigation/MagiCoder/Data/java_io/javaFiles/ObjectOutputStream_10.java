import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_10 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.dat"))) {
            float value = 123.45f;
            oos.writeFloat(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
