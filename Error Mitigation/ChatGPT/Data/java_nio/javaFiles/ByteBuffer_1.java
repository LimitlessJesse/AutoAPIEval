import java.nio.ByteBuffer;

public class ByteBuffer_1 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Capacity: " + buffer.capacity());
        System.out.println("Position: " + buffer.position());
        System.out.println("Limit: " + buffer.limit());
    }
}
