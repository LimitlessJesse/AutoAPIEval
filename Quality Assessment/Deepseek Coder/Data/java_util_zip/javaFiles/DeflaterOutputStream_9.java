import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.io.ByteArrayOutputStream;

public class DeflaterOutputStream_9 {
    public static void main(String[] args) {
        byte[] input = "Hello, World!".getBytes();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream);
            deflaterOutputStream.write(input);
            deflaterOutputStream.close(); // This is where the void close() method is used

            byte[] output = outputStream.toByteArray();
            System.out.println(new String(output));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
