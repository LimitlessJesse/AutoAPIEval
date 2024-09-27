import java.nio.FloatBuffer;

public class FloatBuffer_3 {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(10);
        buffer.put(3.14f);
        System.out.println(buffer.get(0));
    }
}
