import java.nio.IntBuffer;

public class IntBuffer_1 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        buffer.put(1);
        buffer.put(2);
        buffer.put(3);
        buffer.put(4);
        buffer.put(5);
        
        buffer.rewind();
        
        System.out.println("Elements in buffer:");
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
