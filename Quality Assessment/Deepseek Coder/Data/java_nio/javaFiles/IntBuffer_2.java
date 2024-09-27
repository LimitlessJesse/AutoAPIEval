import java.nio.IntBuffer;

public class IntBuffer_2 {
    public static void main(String[] args) {
        // Create a new IntBuffer with a capacity of 5
        IntBuffer buffer = IntBuffer.allocate(5);

        // Put some values into the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i * 2);
        }

        // Rewind the buffer to read from the beginning
        buffer.rewind();

        // Get the value at index 3
        int value = buffer.get(3);

        // Print the value
        System.out.println("The value at index 3 is: " + value);
    }
}
