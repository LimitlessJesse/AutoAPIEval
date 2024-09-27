import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_2 {
    public static void main(String[] args) {
        byte[] input = "Hello, World!".getBytes();
        byte[] output = new byte[input.length];

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater())) {
                dos.write(input);
            }

            byte[] compressed = baos.toByteArray();

            try (InflaterOutputStream ios = new InflaterOutputStream(new ByteArrayOutputStream(), new Inflater())) {
                ios.write(compressed, 0, compressed.length);
                output = ((ByteArrayOutputStream) ios).toByteArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(new String(output));
    }
}
