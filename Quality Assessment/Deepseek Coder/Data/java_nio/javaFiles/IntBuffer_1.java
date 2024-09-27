import java.nio.IntBuffer;

public class IntBuffer_1 {
    public static void main(String[] args) {
        // Create a new IntBuffer with a capacity of 5
        IntBuffer buffer = IntBuffer.allocate(5);

        // Put some values into the buffer
        buffer.put(1);
        buffer.put(2);
        buffer.put(3);
        buffer.put(4);
        buffer.put(5);

        // Flip the buffer to prepare it for reading
        buffer.flip();

        // Retrieve the first value from the buffer
        int firstValue = buffer.get();

        // Print the first value
        System.out.println("First value: " + firstValue);

        // Retrieve the remaining values from the buffer
        while(buffer.hasRemaining()) {
            System.out.println("Remaining value: " + buffer.get());
        }
    }
}
