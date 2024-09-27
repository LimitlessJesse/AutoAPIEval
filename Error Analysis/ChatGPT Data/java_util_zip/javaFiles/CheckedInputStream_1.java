import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class CheckedInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            Checksum checksum = new SomeChecksum();
            CheckedInputStream cis = new CheckedInputStream(fis, checksum);
            int data = cis.read();
            System.out.println("Read data: " + data);
            cis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static class SomeChecksum implements Checksum {
        @Override
        public void update(int b) {

        }

        @Override
        public void update(byte[] b, int off, int len) {

        }

        @Override
        public long getValue() {
            return 0;
        }
    }
}
