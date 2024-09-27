import java.nio.DoubleBuffer;

public class DoubleBuffer_4 {
    public static void main(String[] args) {
        // Create a double buffer
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        buffer.put(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        
        // Duplicate the buffer
        DoubleBuffer duplicateBuffer = buffer.duplicate();
        
        // Print the content of the original buffer
        System.out.print("Original Buffer: ");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();
        
        // Print the content of the duplicated buffer
        System.out.print("Duplicated Buffer: ");
        while (duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get() + " ");
        }
        System.out.println();
    }
}
