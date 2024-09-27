import java.nio.FloatBuffer;

public class FloatBuffer_4 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(5);
        buffer.put(1.0f);
        buffer.put(2.0f);
        buffer.put(3.0f);
        buffer.put(4.0f);
        buffer.put(5.0f);

        FloatBuffer duplicateBuffer = buffer.duplicate();

        System.out.println("Original Buffer:");
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }

        System.out.println("\nDuplicate Buffer:");
        while (duplicateBuffer.hasRemaining()) {
            System.out.println(duplicateBuffer.get());
        }
    }
}
