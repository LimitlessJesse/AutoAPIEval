import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckedInputStream_4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.zip");
            CheckedInputStream cis = new CheckedInputStream(fis, new CRC32());
            Checksum checksum = cis.getChecksum();
            System.out.println("Checksum value: " + checksum.getValue());
            cis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
