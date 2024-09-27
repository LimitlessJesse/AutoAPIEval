import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import java.util.zip.Adler32;

public class CheckedInputStream_3 {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        Checksum checksum = new Adler32();
        CheckedInputStream checkedInputStream = new CheckedInputStream(new ByteArrayInputStream("Hello, World!".getBytes()), checksum);

        try {
            while (checkedInputStream.read(buffer, 0, buffer.length)!= -1) {
                // Do something with the data read
            }

            System.out.println("Checksum: " + checksum.getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
