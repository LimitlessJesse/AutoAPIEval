import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_4 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);

            // Write data to DeflaterOutputStream

            deflaterOutputStream.finish(); // Finish writing compressed data

            // Continue using the DeflaterOutputStream or close it
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
