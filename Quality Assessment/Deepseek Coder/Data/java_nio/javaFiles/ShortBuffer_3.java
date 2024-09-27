import java.nio.*;

public class ShortBuffer_3 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((short) i);
        }

        // Rewind the buffer
        buffer.rewind();

        // Create a slice of the buffer
        ShortBuffer slice = buffer.slice();

        // Change the data in the slice
        for (int i = 0; i < slice.capacity(); i++) {
            slice.put(i, (short) (slice.get(i) * 2));
        }

        // Rewind the buffer
        buffer.rewind();

        // Print the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.print(buffer.get(i) + " ");
        }
    }
}
