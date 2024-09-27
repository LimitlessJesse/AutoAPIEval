import java.nio.IntBuffer;

public class Buffer_5 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(1);
        buffer.put(2);
        buffer.put(3);
        buffer.flip();
        
        System.out.println("Remaining elements in buffer: " + buffer.remaining());
    }
}
