import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_3 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            file.write(65); // writes the byte value 65 to the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
