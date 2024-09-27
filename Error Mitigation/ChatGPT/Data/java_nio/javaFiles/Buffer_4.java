import java.nio.Buffer;

public class Buffer_4 {
    public static void main(String[] args) {
        Buffer buffer = Buffer.allocate(10);
        boolean remaining = buffer.hasRemaining();
        System.out.println("Remaining elements in buffer: " + remaining);
    }
}
