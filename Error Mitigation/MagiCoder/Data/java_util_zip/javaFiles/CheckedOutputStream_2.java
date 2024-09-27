import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CheckedOutputStream;
import java.util.zip.CRC32;

public class CheckedOutputStream_2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt");
             CheckedOutputStream cos = new CheckedOutputStream(fos, new CRC32())) {
            String text = "Hello, World!";
            byte[] bytes = text.getBytes();
            for (byte b : bytes) {
                cos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
