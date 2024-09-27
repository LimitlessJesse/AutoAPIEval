import java.nio.IntBuffer;

public class IntBuffer_2 {
    public static void main(String[] args) {
        // Create an IntBuffer
        IntBuffer originalBuffer = IntBuffer.allocate(5);

        // Fill the buffer with some data
        for (int i = 0; i < originalBuffer.capacity(); i++) {
            originalBuffer.put(i);
        }

        // Duplicate the buffer
        IntBuffer duplicateBuffer = originalBuffer.duplicate();

        // Print the content of the original and duplicate buffers
        System.out.println("Original buffer:");
        while (originalBuffer.hasRemaining()) {
            System.out.println(originalBuffer.get());
        }

        System.out.println("Duplicate buffer:");
        while (duplicateBuffer.hasRemaining()) {
            System.out.println(duplicateBuffer.get());
        }
    }
}
