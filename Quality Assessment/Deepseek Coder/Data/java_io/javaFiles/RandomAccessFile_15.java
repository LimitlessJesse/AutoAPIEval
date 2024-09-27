import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_15 {
    public static void main(String[] args) {
        try {
            // Create a new RandomAccessFile
            RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");

            // Write an integer to the file
            int value = 65; // 'A' in ASCII
            raf.write(value);

            // Close the file
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
