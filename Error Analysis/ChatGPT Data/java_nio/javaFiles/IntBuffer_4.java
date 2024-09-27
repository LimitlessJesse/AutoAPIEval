import java.nio.IntBuffer;

public class IntBuffer_4 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(1);
        buffer.put(2);
        buffer.put(3);
        buffer.put(4);
        buffer.put(5);
        
        System.out.println("Buffer: " + buffer);
        
        buffer.compact();
        
        System.out.println("Buffer after compact(): " + buffer);
    }
}
