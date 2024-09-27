import java.nio.FloatBuffer;

public class FloatBuffer_4 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(5);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (float) i);
        }

        // Duplicate the buffer
        FloatBuffer duplicate = buffer.duplicate();

        // Print the original buffer
        System.out.println("Original buffer:");
        while(buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }

        System.out.println("\n");

        // Print the duplicate buffer
        System.out.println("Duplicate buffer:");
        while(duplicate.hasRemaining()) {
            System.out.print(duplicate.get() + " ");
        }
    }
}
