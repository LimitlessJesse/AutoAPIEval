import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("compressedFile.txt");
            InflaterInputStream inflaterInputStream = new InflaterInputStream(fileInputStream);

            int bytesAvailable = inflaterInputStream.available();
            System.out.println("Number of bytes available to read: " + bytesAvailable);

            inflaterInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
