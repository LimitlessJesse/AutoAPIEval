import java.nio.Buffer;

public class Buffer_1 {
    public static void main(String[] args) {
        Buffer buffer = Buffer.allocate(10);
        System.out.println("Capacity: " + buffer.capacity());
    }
}
