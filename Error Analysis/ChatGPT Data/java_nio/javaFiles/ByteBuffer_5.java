import java.nio.ByteBuffer;

public class ByteBuffer_5 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        System.out.println("Before compact(), position: " + buffer.position());

        buffer.compact();
        System.out.println("After compact(), position: " + buffer.position());
    }
}
