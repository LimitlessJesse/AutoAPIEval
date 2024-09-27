import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile_23 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");
            raf.write("Hello, World!".getBytes());
            raf.seek(0);  // Moves the file pointer to the start of the file
            byte[] data = new byte[(int) raf.length()];
            raf.read(data);
            System.out.println(new String(data));
            raf.seek(5);  // Moves the file pointer to the 5th byte
            raf.write("Hello".getBytes());
            raf.seek(0);
            raf.read(data);
            System.out.println(new String(data));
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
