import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel_5 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
             FileChannel channel = file.getChannel()) {

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, channel.size());

            // Use the buffer here

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
