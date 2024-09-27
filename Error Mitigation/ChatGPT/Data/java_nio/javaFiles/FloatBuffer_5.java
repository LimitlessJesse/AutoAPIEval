import java.nio.FloatBuffer;

public class FloatBuffer_5 {
    public static void main(String[] args) {
        // Create a float buffer
        FloatBuffer buffer = FloatBuffer.allocate(5);
        buffer.put(new float[]{1.0f, 2.0f, 3.0f, 4.0f, 5.0f});
        
        // Duplicate the buffer
        FloatBuffer duplicateBuffer = buffer.duplicate();
        
        // Print the content of the original buffer
        System.out.print("Original buffer: ");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        
        // Print the content of the duplicated buffer
        System.out.print("\nDuplicated buffer: ");
        while (duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get() + " ");
        }
    }
}
