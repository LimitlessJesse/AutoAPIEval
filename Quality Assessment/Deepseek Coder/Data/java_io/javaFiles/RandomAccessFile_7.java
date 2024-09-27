import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_7 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");
            String str = "Hello, World!";
            byte[] strBytes = str.getBytes();
            raf.write(strBytes, 0, strBytes.length);
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
