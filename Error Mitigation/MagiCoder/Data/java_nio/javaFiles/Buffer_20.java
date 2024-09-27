import java.nio.ByteBuffer;

public class Buffer_20 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);
        buffer.flip();
        buffer.mark();
        System.out.println(buffer.get());
        System.out.println(buffer.get());
        buffer.reset();
        System.out.println(buffer.get());
    }
}
