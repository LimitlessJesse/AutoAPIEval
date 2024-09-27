import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_5 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            file.setLength(100); // Set the length of the file to 100 bytes
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
