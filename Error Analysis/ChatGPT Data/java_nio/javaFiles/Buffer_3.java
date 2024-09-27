import java.nio.ByteBuffer;

public class Buffer_3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.putInt(123);

        System.out.println("Before flip: " + buffer);

        buffer.flip();

        System.out.println("After flip: " + buffer);
    }
}
