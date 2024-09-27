import java.nio.ByteBuffer;

public class Buffer_6 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Write some data into the buffer
        byte[] data = {1, 2, 3, 4, 5};
        buffer.put(data);

        // Flip the buffer
        buffer.flip();

        // Read data from the buffer
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
