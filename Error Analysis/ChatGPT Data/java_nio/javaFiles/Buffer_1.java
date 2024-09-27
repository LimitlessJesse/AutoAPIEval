import java.nio.IntBuffer;

public class Buffer_1 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);
        System.out.println("Capacity: " + buffer.capacity());
    }
}
