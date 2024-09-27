import java.nio.IntBuffer;

public class IntBuffer_13 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        buffer.put(1, 2);
        buffer.put(3, 4);
        buffer.flip();
        System.out.println("Array offset: " + buffer.arrayOffset());
    }
}
