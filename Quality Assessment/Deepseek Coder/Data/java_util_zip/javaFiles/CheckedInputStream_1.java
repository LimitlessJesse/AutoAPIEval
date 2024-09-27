import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import java.util.zip.Adler32;

public class CheckedInputStream_1 {
    public static void main(String[] args) {
        try {
            Checksum adler32 = new Adler32();
            CheckedInputStream checkedInputStream = new CheckedInputStream(new FileInputStream("file.txt"), adler32);

            int data;
            while ((data = checkedInputStream.read())!= -1) {
                // Process the data
            }

            long checksum = adler32.getValue();
            System.out.println("Checksum: " + checksum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
