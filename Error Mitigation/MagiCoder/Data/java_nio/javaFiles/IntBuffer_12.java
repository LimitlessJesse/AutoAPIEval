import java.nio.IntBuffer;

public class IntBuffer_12 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        System.out.println(buffer.hasArray());
    }
}
