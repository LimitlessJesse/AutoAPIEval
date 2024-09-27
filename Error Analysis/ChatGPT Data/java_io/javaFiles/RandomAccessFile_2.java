import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            byte[] data = "Hello, World!".getBytes();
            file.write(data);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
