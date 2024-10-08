import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_4 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            byte[] buffer = new byte[1024];
            int bytesRead = raf.read(buffer, 0, buffer.length);
            while (bytesRead!= -1) {
                // process the data in the buffer
                bytesRead = raf.read(buffer, 0, buffer.length);
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
