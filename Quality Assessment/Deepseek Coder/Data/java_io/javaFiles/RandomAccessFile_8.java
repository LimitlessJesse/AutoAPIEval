import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile_8 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");
            raf.writeBytes("Hello, World!");
            System.out.println("Initial length: " + raf.length());
            
            // Set new length
            raf.setLength(10);
            System.out.println("New length: " + raf.length());
            
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
