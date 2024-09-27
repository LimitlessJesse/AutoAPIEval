import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedByteBuffer_2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
             FileChannel channel = file.getChannel()) {

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);
            buffer.put(0, (byte) 'H');
            buffer.put(1, (byte) 'i');

            // Force changes to be persisted to disk
            buffer.force();
            System.out.println("Changes have been forced to disk.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
