import java.nio.LongBuffer;

public class LongBuffer_5 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(5);
        buffer.put(1L);
        buffer.put(2L);
        buffer.put(3L);
        buffer.put(4L);
        buffer.put(5L);
        
        LongBuffer slicedBuffer = buffer.slice();
        
        System.out.println("Original buffer:");
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
        
        System.out.println("Sliced buffer:");
        while (slicedBuffer.hasRemaining()) {
            System.out.println(slicedBuffer.get());
        }
    }
}
