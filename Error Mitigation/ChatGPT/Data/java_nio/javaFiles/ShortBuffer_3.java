import java.nio.ShortBuffer;

public class ShortBuffer_3 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(5);
        buffer.put((short) 1);
        buffer.put((short) 2);
        buffer.put((short) 3);
        buffer.put((short) 4);
        buffer.put((short) 5);
        
        ShortBuffer slicedBuffer = buffer.slice();
        
        System.out.println("Original Buffer:");
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
        
        System.out.println("Sliced Buffer:");
        while (slicedBuffer.hasRemaining()) {
            System.out.println(slicedBuffer.get());
        }
    }
}
