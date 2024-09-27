import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStream_5 {
    public static void main(String[] args) {
        byte[] bytes = "Hello, World!".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);

        try {
            System.out.println("Available bytes: " + bufferedInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
