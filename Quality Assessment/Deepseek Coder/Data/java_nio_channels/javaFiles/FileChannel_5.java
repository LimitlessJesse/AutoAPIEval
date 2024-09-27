import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class FileChannel_5 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            FileChannel channel = raf.getChannel();

            // Truncate the file to 10 bytes
            channel.truncate(10);

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
