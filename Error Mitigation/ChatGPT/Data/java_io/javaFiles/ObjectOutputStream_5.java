import java.io.ObjectOutputStream;
import java.io.IOException;

public class ObjectOutputStream_5 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(System.out);
            outputStream.writeObject("Hello, World!");
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
