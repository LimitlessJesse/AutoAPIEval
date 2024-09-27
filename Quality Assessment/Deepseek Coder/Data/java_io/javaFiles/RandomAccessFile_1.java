import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile_1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("example.txt", "r");
            int i;
            while ((i = raf.read())!= -1) {
                System.out.print((char) i);
            }
            raf.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
