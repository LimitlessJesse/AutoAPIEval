import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

public class DeflaterOutputStream_2 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new DeflaterOutputStream(System.out);
            outputStream.write('H');
            outputStream.write('e');
            outputStream.write('l');
            outputStream.write('l');
            outputStream.write('o');
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
