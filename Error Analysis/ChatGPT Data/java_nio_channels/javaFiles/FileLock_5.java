import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.io.IOException;

public class FileLock_5 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
            FileChannel channel = file.getChannel();
            FileLock lock = channel.lock();

            System.out.println("Size of the file: " + lock.size());

            lock.release();
            channel.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
