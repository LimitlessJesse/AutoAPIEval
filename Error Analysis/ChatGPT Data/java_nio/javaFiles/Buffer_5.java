import java.nio.ByteBuffer;

public class Buffer_5 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putInt(5);
        buffer.putInt(10);

        System.out.println("Remaining bytes: " + buffer.remaining());
    }
}
