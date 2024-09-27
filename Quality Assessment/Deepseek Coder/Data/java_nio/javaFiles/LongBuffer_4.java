import java.nio.LongBuffer;

public class LongBuffer_4 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(5);
        buffer.put(100L);
        buffer.put(200L);
        buffer.put(300L);
        buffer.put(400L);
        buffer.put(500L);
        
        // Flip the buffer to prepare for reading
        buffer.flip();
        
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
