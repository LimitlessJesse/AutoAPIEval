import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "r");
            int data = file.read();
            System.out.println("Read data: " + data);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
