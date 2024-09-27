import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_12 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            FileDescriptor fd = raf.getFD();
            System.out.println("FileDescriptor: " + fd);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
