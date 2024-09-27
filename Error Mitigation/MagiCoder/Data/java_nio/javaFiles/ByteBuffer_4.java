import java.nio.ByteBuffer;

public class ByteBuffer_4 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        byte[] src = {1, 2, 3, 4, 5};
        buffer.put(src, 0, 5);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
