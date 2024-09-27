import java.nio.LongBuffer;

public class LongBuffer_3 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        buffer.put(123L);
        buffer.flip();
        
        long value = buffer.get();
        System.out.println("Value retrieved from buffer: " + value);
    }
}
