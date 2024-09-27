import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFile_4 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("sample.txt", "r");
            long fileLength = file.length();
            System.out.println("File length: " + fileLength);
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
