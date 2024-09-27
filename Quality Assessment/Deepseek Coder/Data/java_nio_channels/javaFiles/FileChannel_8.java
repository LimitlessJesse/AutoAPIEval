import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;

public class FileChannel_8 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("example.txt");
        FileChannel fc = fos.getChannel();

        // Create a buffer
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Write some bytes into the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Rewind the buffer so that it's position is set to zero
        buffer.rewind();

        // Use the position() method to get the current position of the buffer
        System.out.println("Position before writing: " + buffer.position());

        // Write the buffer into the channel
        fc.write(buffer);

        // Use the position() method to get the current position of the buffer after writing
        System.out.println("Position after writing: " + buffer.position());

        // Close the channel
        fc.close();
    }
}
