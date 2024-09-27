import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_8 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] output;

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (DeflaterOutputStream dos = new DeflaterOutputStream(baos)) {
                dos.write(data.getBytes());
                dos.finish(); // Finish the compression process
                output = baos.toByteArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Original data: " + data);
        System.out.println("Compressed data: " + new String(output));
    }
}
