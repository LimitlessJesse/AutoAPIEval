import java.nio.IntBuffer;

public class IntBuffer_8 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        buffer.put(10);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
