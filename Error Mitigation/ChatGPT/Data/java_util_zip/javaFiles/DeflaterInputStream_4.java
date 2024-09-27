import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_4 {
    public static void main(String[] args) {
        try {
            DeflaterInputStream inputStream = new DeflaterInputStream(null);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
