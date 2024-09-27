import java.nio.FloatBuffer;

public class FloatBuffer_1 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(5);
        System.out.println("Capacity: " + buffer.capacity());
    }
}
