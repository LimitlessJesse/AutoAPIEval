import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.IOException;

public class FileChannel_4 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
             FileChannel channel = file.getChannel()) {

            // Attempt to lock a region of the file
            FileLock lock = channel.lock(0, 10, false);

            // Perform operations within the locked region

            // Release the lock
            lock.release();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
