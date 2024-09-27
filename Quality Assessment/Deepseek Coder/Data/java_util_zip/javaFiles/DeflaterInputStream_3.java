import java.util.zip.DeflaterInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DeflaterInputStream_3 {
    public static void main(String[] args) {
        byte[] data = "Hello, World!".getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        DeflaterInputStream deflaterInputStream = new DeflaterInputStream(byteArrayInputStream);

        try {
            int availableBytes = deflaterInputStream.available();
            System.out.println("Number of bytes available: " + availableBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
