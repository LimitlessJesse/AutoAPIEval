import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLock_3 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            FileChannel channel = raf.getChannel();
            FileLock lock = channel.tryLock();

            if(lock != null) {
                boolean isShared = lock.isShared();
                System.out.println("Is lock shared? " + isShared);

                lock.release();
            }

            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
