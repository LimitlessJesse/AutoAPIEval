import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile_1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            file.writeBytes("Hello, World!");
            
            // Set the file-pointer offset at position 7
            file.seek(7);
            // Check the current file pointer offset
            System.out.println("Current File Pointer offset: " + file.getFilePointer());
            
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
