import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public class FileLock_11 {
    public static void main(String[] args) throws Exception {
        File file = new File("example.txt");
        RandomAccessFile raFile = new RandomAccessFile(file, "rw");
        FileLock fileLock = raFile.getChannel().lock();

        // Check if the lock is shared
        boolean isShared = fileLock.isShared();
        System.out.println("Is the lock shared? " + isShared);

        raFile.close();
    }
}
