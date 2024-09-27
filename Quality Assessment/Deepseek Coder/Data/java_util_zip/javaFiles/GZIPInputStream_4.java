import java.util.zip.GZIPInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class GZIPInputStream_4 {
    public static void main(String[] args) {
        GZIPInputStream gis = null;
        try {
            gis = new GZIPInputStream(new FileInputStream("file.gz"));
            // Read from gis
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (gis!= null) {
                    gis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
