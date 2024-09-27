import java.io.IOException;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_3 {
    public static void main(String[] args) {
        try {
            InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(System.out);
            inflaterOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
