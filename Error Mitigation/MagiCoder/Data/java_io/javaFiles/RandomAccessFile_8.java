import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_8 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.seek(10); // Set the file pointer to 10 bytes from the beginning of the file
            raf.write("Hello".getBytes()); // Write "Hello" at the current file pointer position
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
