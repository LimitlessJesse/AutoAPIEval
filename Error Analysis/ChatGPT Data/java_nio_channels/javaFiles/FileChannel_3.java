import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

public class FileChannel_3 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            FileChannel channel = file.getChannel();
            long size = channel.size();
            System.out.println("File size: " + size);
            
            channel.close();
            file.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
