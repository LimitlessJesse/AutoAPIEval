import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.io.ByteArrayOutputStream;

public class DeflaterOutputStream_4 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] input = data.getBytes();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             DeflaterOutputStream dos = new DeflaterOutputStream(baos)) {

            dos.write(input);
            dos.close();

            byte[] output = baos.toByteArray();
            System.out.println(new String(output));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
