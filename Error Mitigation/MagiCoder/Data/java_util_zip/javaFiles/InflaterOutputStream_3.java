import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_3 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DeflaterOutputStream dos = new DeflaterOutputStream(baos);
            InflaterOutputStream ios = new InflaterOutputStream(dos);

            ios.write("Hello, World!".getBytes());
            ios.finish();

            System.out.println(new String(baos.toByteArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
