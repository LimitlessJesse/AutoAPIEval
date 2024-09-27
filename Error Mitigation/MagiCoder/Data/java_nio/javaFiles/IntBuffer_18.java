import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class IntBuffer_18 {
    public static void main(String[] args) {
        // Create an IntBuffer
        IntBuffer buffer = IntBuffer.allocate(10);

        // Get the byte order of the buffer
        ByteOrder byteOrder = buffer.order();

        // Print the byte order
        System.out.println("Byte Order: " + byteOrder);
    }
}
