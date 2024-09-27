import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLock_12 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileChannel channel = new FileOutputStream(file).getChannel();
            FileLock lock = channel.tryLock();

            if (lock!= null) {
                System.out.println("Lock is valid: " + lock.isValid());
            } else {
                System.out.println("Lock is null");
            }

            lock.release();
            channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
