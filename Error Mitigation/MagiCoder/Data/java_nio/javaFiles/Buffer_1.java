import java.nio.ByteBuffer;

public class Buffer_1 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Capacity: " + buffer.capacity());
    }
}
