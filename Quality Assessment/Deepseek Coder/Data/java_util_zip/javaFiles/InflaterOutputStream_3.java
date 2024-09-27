import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_3 {
    public static void main(String[] args) {
        byte[] input = { 0x78, 0x01, 0x42, 0x4d, 0x58 }; // This is a sample input
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (InflaterOutputStream ios = new InflaterOutputStream(baos)) {
            for (byte b : input) {
                ios.write(b);
            }
            ios.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] output = baos.toByteArray();
        System.out.println(new String(output));
    }
}
