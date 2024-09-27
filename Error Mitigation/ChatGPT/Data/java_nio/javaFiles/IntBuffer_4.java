import java.nio.IntBuffer;

public class IntBuffer_4 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(1);
        buffer.put(2);
        buffer.put(3);
        
        IntBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
        
        System.out.println("Original buffer: ");
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
        
        System.out.println("Read-only buffer: ");
        while(readOnlyBuffer.hasRemaining()) {
            System.out.println(readOnlyBuffer.get());
        }
        
        // Trying to modify the read-only buffer will throw a ReadOnlyBufferException
        // readOnlyBuffer.put(4);
    }
}
