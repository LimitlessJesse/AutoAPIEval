import java.nio.ShortBuffer;

public class ShortBuffer_2 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(10);
        buffer.put((short) 10);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
