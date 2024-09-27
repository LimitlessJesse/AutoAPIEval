import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_3 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             DeflaterOutputStream dos = new DeflaterOutputStream(baos)) {
            String data = "Hello, world!";
            byte[] bytes = data.getBytes();
            dos.write(bytes, 0, bytes.length);
            dos.close();
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
