import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_1 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("output.txt");
            byte b = (byte)'A'; // This is the byte to be written
            outputStream.write(b);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
