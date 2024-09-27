import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.IOException;

public class FileLock_4 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            FileChannel channel = file.getChannel();
            FileLock lock = channel.lock(0, Long.MAX_VALUE, true);
            
            long lockedRegionSize = lock.size();
            System.out.println("Size of locked region: " + lockedRegionSize);
            
            lock.release();
            channel.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
