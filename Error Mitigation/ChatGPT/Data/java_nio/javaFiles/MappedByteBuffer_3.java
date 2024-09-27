import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedByteBuffer_3 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            FileChannel channel = file.getChannel();
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, channel.size());
            
            // Load the buffer's content into physical memory
            buffer.load();
            
            // Perform operations on the buffer
            
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
