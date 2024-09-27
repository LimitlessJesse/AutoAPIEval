import java.io.IOException;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_2 {
    public static void main(String[] args) {
        try {
            InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(System.out);
            inflaterOutputStream.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
