import java.nio.ShortBuffer;

public class ShortBuffer_1 {
    public static void main(String[] args) {
        short[] array = {1, 2, 3, 4, 5};
        ShortBuffer buffer = ShortBuffer.allocate(array.length);
        buffer.put(array);
        buffer.rewind();
        
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
