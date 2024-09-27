import java.nio.FloatBuffer;

public class FloatBuffer_5 {
    public static void main(String[] args) {
        // Create a FloatBuffer of capacity 5
        FloatBuffer buf = FloatBuffer.allocate(5);

        // Put some data into the buffer
        buf.put(0, 1.0f);
        buf.put(1, 2.0f);
        buf.put(2, 3.0f);
        buf.put(3, 4.0f);
        buf.put(4, 5.0f);

        // Flip the buffer to read mode
        buf.flip();

        // Create a slice of the buffer from index 1 to 3
        FloatBuffer slice = buf.slice();

        // Print the slice
        while(slice.hasRemaining()) {
            System.out.println(slice.get());
        }
    }
}
