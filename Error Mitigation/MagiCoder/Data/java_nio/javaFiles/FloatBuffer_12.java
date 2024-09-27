import java.nio.FloatBuffer;

public class FloatBuffer_12 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);
        buffer.put(0, 1.23f);
        buffer.flip();
        System.out.println(buffer.get(0));
    }
}
