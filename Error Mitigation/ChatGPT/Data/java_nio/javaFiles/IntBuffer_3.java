import java.nio.IntBuffer;

public class IntBuffer_3 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(new int[]{1, 2, 3, 4, 5});
        
        IntBuffer slicedBuffer = buffer.slice();
        
        System.out.println("Original Buffer:");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        
        System.out.println("\nSliced Buffer:");
        while (slicedBuffer.hasRemaining()) {
            System.out.print(slicedBuffer.get() + " ");
        }
    }
}
