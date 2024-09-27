import java.nio.ShortBuffer;

public class ShortBuffer_5 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(5);
        buffer.put((short) 10);
        buffer.put((short) 20);
        buffer.put((short) 30);
        buffer.put((short) 40);
        buffer.put((short) 50);

        // Flip the buffer to prepare for reading
        buffer.flip();

        // Read the buffer
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
