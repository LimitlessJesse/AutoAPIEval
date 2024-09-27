import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_1 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);

            byte[] data = "Hello, World!".getBytes();
            int offset = 0;
            int length = data.length;

            deflaterOutputStream.write(data, offset, length);
            deflaterOutputStream.finish();
            deflaterOutputStream.close();

            byte[] compressedData = byteArrayOutputStream.toByteArray();
            System.out.println("Compressed data: " + new String(compressedData));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
