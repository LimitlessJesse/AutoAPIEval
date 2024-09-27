import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_5 {
    public static void main(String[] args) {
        try {
            // Create a RandomAccessFile with read-write access
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");

            // Write a string in UTF format to the file
            String text = "Hello, World!";
            file.writeUTF(text);

            // Close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
