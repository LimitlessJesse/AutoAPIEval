import java.nio.IntBuffer;

public class IntBuffer_9 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        buffer.put(0, 10);
        buffer.flip();
        System.out.println(buffer.get(0));
    }
}
