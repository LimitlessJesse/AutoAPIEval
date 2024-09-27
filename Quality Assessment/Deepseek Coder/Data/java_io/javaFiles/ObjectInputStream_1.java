import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class ObjectInputStream_1 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] bytes = data.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        try {
            int availableBytes = ois.available();
            System.out.println("Number of bytes available: " + availableBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
