import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_26 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");
            String str = "Hello, World!";
            raf.write(str.getBytes());
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
