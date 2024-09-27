import java.nio.ShortBuffer;

public class ShortBuffer_2 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);
        
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((short) i);
        }
        
        // Duplicate the buffer
        ShortBuffer duplicateBuffer = buffer.duplicate();
        
        // Flip the buffer to read mode
        buffer.flip();
        
        // Read from the original buffer
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        
        System.out.println();
        
        // Read from the duplicate buffer
        while (duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get() + " ");
        }
    }
}
