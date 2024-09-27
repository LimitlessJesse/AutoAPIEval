import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_6 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] input = data.getBytes();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             DeflaterOutputStream dos = new DeflaterOutputStream(baos)) {

            dos.write(input, 0, input.length);
            dos.close();

            byte[] output = baos.toByteArray();
            System.out.println(new String(output));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
