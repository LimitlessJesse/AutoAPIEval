import java.nio.IntBuffer;

public class IntBuffer_5 {
    public static void main(String[] args) {
        // Create a new IntBuffer
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(new int[]{1, 2, 3, 4, 5});
        
        // Create a slice of the buffer
        IntBuffer sliceBuffer = buffer.slice();
        
        // Print the sliceBuffer contents
        while(sliceBuffer.hasRemaining()) {
            System.out.println(sliceBuffer.get());
        }
    }
}
