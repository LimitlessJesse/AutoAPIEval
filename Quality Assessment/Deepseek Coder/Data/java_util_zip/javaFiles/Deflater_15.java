import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Deflater_15 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos);
        dos.write("Hello, World!".getBytes());
        dos.close();
        System.out.println("Total output bytes: " + baos.toByteArray().length);
    }
}
