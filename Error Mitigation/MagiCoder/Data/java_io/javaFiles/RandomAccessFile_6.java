import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_6 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            String str = "Hello, World!";
            byte[] bytes = str.getBytes();
            raf.write(bytes);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
