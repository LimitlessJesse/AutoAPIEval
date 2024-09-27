import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class CheckedInputStream_5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.zip");
             CheckedInputStream cis = new CheckedInputStream(fis, new Checksum() {
                 private long sum;

                 @Override
                 public void update(int b) {
                     sum += b;
                 }

                 @Override
                 public void reset() {
                     sum = 0;
                 }

                 @Override
                 public long getValue() {
                     return sum;
                 }
             })) {
            cis.skip(100);
            System.out.println("Checksum: " + cis.getChecksum().getValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
