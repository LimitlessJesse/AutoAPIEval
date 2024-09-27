import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_3 {
    public static void main(String[] args) {
        byte[] input = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input);
        DeflaterInputStream deflaterInputStream = new DeflaterInputStream(byteArrayInputStream);

        byte[] output = new byte[input.length];
        try {
            int bytesRead = deflaterInputStream.read(output);
            System.out.println("Bytes read: " + bytesRead);
            System.out.println("Output: " + new String(output));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
