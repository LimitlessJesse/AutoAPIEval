import java.nio.DoubleBuffer;

public class DoubleBuffer_5 {
    public static void main(String[] args) {
        // Create a DoubleBuffer
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        
        // Add some doubles to the buffer
        buffer.put(1.1);
        buffer.put(2.2);
        buffer.put(3.3);
        buffer.put(4.4);
        buffer.put(5.5);
        
        // Compact the buffer
        DoubleBuffer compactedBuffer = buffer.compact();
        
        // Print the compacted buffer
        System.out.println("Compacted Buffer:");
        while (compactedBuffer.hasRemaining()) {
            System.out.println(compactedBuffer.get());
        }
    }
}
