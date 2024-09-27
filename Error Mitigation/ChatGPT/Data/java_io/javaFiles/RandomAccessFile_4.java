import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_4 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
            long fileLength = file.length();
            System.out.println("Length of the file: " + fileLength + " bytes");
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
