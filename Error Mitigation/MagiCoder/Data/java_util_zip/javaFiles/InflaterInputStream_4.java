import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_4 {
    public static void main(String[] args) {
        byte[] data = { 0x1F, 0x8B, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFF, 0x06, 0x00, 0x42, 0x43, 0x02, 0x00, 0x1B };
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);

        byte[] buffer = new byte[1024];
        int len;
        try {
            while ((len = inflaterInputStream.read(buffer))!= -1) {
                System.out.println(new String(buffer, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
