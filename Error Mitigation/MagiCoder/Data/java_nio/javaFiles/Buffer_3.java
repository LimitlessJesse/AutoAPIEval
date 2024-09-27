import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("Initial position: " + buffer.position());

        buffer.position(5);
        System.out.println("New position: " + buffer.position());
    }
}
