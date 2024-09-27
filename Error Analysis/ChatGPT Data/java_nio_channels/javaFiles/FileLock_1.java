import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLock_1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            FileChannel channel = file.getChannel();
            FileLock lock = channel.lock();
            
            lock.release(); // Releases the file lock
            
            channel.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
