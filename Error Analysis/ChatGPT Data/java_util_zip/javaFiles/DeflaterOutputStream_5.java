import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_5 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DeflaterOutputStream dos = new DeflaterOutputStream(bos);
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
