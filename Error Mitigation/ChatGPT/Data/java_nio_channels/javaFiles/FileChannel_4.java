import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel_4 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
             FileChannel channel = file.getChannel()) {

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);

            buffer.putChar('H');
            buffer.putChar('i');

            System.out.println("File content: " + file.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
