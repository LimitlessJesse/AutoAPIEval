import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_3 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("data.txt", "r");
            int intValue = file.readInt();
            System.out.println("Read integer value: " + intValue);
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the integer value.");
            e.printStackTrace();
        }
    }
}
