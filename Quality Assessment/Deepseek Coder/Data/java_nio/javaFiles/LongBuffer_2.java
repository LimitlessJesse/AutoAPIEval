import java.nio.*;

public class LongBuffer_2 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(5);
        
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((long) i);
        }
        
        // Rewind the buffer
        buffer.rewind();
        
        // Duplicate the buffer
        LongBuffer duplicateBuffer = buffer.duplicate();
        
        // Print the original buffer
        System.out.println("Original buffer:");
        while(buffer.hasRemaining()){
            System.out.print(buffer.get() + " ");
        }
        
        System.out.println();
        
        // Print the duplicate buffer
        System.out.println("Duplicate buffer:");
        while(duplicateBuffer.hasRemaining()){
            System.out.print(duplicateBuffer.get() + " ");
        }
    }
}
