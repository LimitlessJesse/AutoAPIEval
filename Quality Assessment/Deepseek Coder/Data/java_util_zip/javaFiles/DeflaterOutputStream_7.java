import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import java.io.ByteArrayOutputStream;

public class DeflaterOutputStream_7 {
    public static void main(String[] args) {
        byte[] input = "Hello, World!".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DeflaterOutputStream dos = new DeflaterOutputStream(baos);

        try {
            dos.write(input);
            dos.flush(); // This will flush the output stream
            dos.close(); // This will close the output stream

            byte[] output = baos.toByteArray();
            System.out.println(new String(output));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
