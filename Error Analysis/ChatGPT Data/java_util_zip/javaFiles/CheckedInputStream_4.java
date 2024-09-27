import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class CheckedInputStream_4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            Checksum checksum = new CheckedInputStream(fis, new CRC32()).getChecksum();
            byte[] buffer = new byte[1024];
            while (fis.read(buffer) != -1) {
                checksum.update(buffer, 0, buffer.length);
            }
            System.out.println("Checksum value: " + checksum.getValue());
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
