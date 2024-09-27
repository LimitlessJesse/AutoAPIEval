import java.nio.ByteBuffer;

public class Buffer_8 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 1);
        buffer.flip();
        System.out.println(buffer.hasRemaining()); // Outputs: true
        buffer.get();
        System.out.println(buffer.hasRemaining()); // Outputs: false
    }
}
