import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectOutputStream_14 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.dat"))) {
            oos.writeShort(1234);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
