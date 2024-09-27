import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_11 {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("test.txt", "rw");
            // Perform some operations on the file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (raf!= null) {
                    raf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
