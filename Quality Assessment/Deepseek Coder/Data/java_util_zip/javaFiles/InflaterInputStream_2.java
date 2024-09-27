import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_2 {
    public static void main(String[] args) {
        byte[] data = { 0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x4a, 0x4a, 0x01, 0x00, 0x2b, 0x2d, 0x00, 0x00, 0x00 };
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        InflaterInputStream iis = new InflaterInputStream(bis);

        try {
            int b;
            while ((b = iis.read())!= -1) {
                System.out.println((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
