import java.nio.IntBuffer;

public class IntBuffer_2 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(10);
        buffer.put(20);
        buffer.put(30);
        buffer.put(40);
        buffer.put(50);
        
        buffer.flip();
        
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
