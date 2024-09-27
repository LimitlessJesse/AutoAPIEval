import java.nio.IntBuffer;

public class IntBuffer_3 {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(5);

        buffer.put(0, 10);
        buffer.put(1, 20);
        buffer.put(2, 30);
        buffer.put(3, 40);
        buffer.put(4, 50);

        buffer.flip();

        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
