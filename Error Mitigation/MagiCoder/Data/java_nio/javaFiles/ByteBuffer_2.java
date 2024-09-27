import java.nio.ByteBuffer;

public class ByteBuffer_2 {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4, 5};
        ByteBuffer buffer = ByteBuffer.wrap(array);

        // Print the buffer
        while(buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
