import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_5 {
    public static void main(String[] args) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream("Hello, World!".getBytes());
            InflaterInputStream iis = new InflaterInputStream(bis);
            System.out.println(iis.markSupported());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
