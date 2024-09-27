import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_5 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.dat"))) {
            oos.writeByte(123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
