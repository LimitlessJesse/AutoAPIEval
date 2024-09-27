import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.CRC32;

public class CheckedInputStream_4 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        CheckedInputStream checkedInputStream = new CheckedInputStream(byteArrayInputStream, new CRC32());

        byte[] buffer = new byte[5];
        try {
            int bytesRead = checkedInputStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
            for (byte b : buffer) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
