import java.util.zip.InflaterInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InflaterInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("file.txt");
            InflaterInputStream inflaterInput = new InflaterInputStream(fileInput);
            byte[] data = new byte[1024];
            int bytesRead = inflaterInput.read(data, 0, data.length);
            System.out.println("Bytes read: " + bytesRead);

            inflaterInput.close();
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
