import java.nio.DoubleBuffer;

public class DoubleBuffer_3 {
    public static void main(String[] args) {
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((double)i);
        }
        
        // flip the buffer to read from it
        buffer.flip();
        
        // get the first element
        double first = buffer.get();
        System.out.println("First element: " + first);
        
        // get the third element
        buffer.position(2); // set position to third element
        double third = buffer.get();
        System.out.println("Third element: " + third);
    }
}
