import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_5 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);

        try {
            inflaterInputStream.skip(5);
            int b;
            while ((b = inflaterInputStream.read())!= -1) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
