import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.IOException;

public class FileLock_2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
             FileChannel channel = file.getChannel()) {
            FileLock lock = channel.lock();
            
            // Perform operations with locked channel
            
            lock.release();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
