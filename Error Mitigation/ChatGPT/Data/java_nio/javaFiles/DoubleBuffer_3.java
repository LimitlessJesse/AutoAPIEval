import java.nio.DoubleBuffer;

public class DoubleBuffer_3 {
    public static void main(String[] args) {
        // Create a double buffer
        DoubleBuffer buffer = DoubleBuffer.allocate(5);
        buffer.put(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
        
        // Slice the buffer
        DoubleBuffer slicedBuffer = buffer.slice();
        
        // Output the sliced buffer
        System.out.println("Sliced Buffer: ");
        while (slicedBuffer.hasRemaining()) {
            System.out.println(slicedBuffer.get());
        }
    }
}
