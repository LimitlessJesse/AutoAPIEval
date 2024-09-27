import java.nio.DoubleBuffer;

public class DoubleBuffer_2 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        buffer.put(1.2);
        buffer.put(2.3);
        buffer.put(3.4);
        buffer.put(4.5);
        buffer.put(5.6);

        // Flip the buffer to prepare for reading
        buffer.flip();

        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
