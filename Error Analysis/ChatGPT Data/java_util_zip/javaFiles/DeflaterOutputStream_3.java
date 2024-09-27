import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_3 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);

            // Write some data to the compressed output stream
            deflaterOutputStream.write("Hello, World!".getBytes());
            deflaterOutputStream.flush(); // Flush the compressed output stream

            deflaterOutputStream.close(); // Close the output stream

            System.out.println("Compressed data: " + byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
