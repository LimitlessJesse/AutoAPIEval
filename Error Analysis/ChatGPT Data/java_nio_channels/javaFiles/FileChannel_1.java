import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel_1 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
            FileChannel channel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(48);

            int bytesRead = channel.read(buffer); // Read data from file into buffer
            buffer.flip(); // Flip the buffer to start reading from the beginning

            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get()); // Read bytes from buffer and cast to char
            }

            buffer.clear(); // Clear the buffer for re-use
            channel.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
