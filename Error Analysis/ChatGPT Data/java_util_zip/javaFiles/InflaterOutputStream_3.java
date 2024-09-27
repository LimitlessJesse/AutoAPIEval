import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

public class InflaterOutputStream_3 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InflaterOutputStream inflater = new InflaterOutputStream(baos);
            
            // Write data to the InflaterOutputStream
            
            inflater.flush();
            
            // Continue processing or close the stream
            
            inflater.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
