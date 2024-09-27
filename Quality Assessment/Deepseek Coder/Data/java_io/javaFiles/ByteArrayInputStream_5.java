import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStream_5 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);

        try {
            System.out.println("Bytes available: " + bis.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
