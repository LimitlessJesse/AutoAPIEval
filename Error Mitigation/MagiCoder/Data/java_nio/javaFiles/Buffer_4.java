import java.nio.ByteBuffer;

public class Buffer_4 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Limit: " + buffer.limit());
    }
}
