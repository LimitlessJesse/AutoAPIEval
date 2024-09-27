import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_5 {
    public static void main(String[] args) {
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(System.out);
            deflaterOutputStream.write("Hello, World!".getBytes());
            deflaterOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
