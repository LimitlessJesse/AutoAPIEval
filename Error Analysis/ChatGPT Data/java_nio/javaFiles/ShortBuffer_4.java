import java.nio.ShortBuffer;

public class ShortBuffer_4 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(5);
        buffer.put((short) 10);
        buffer.put((short) 20);
        
        buffer.rewind();
        System.out.println(buffer.get());
    }
}
