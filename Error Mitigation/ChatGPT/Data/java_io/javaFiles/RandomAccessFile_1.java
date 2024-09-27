import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            file.seek(10);
            System.out.println("File pointer set at position: " + file.getFilePointer());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
