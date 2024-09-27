import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.IOException;

public class FileChannel_3 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
             FileChannel channel = file.getChannel()) {

            long position = 0;
            long size = 100;
            boolean shared = false;

            FileLock lock = channel.lock(position, size, shared);
            System.out.println("Lock acquired");

            // Perform operations with the locked region

            lock.release();
            System.out.println("Lock released");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
