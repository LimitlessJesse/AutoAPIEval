import java.nio.ByteBuffer;

public class ByteBuffer_1 {
    public static void main(String[] args) {
        // Creating a ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        // Putting some data into ByteBuffer
        byteBuffer.put("Hello".getBytes());

        // Creating a sliced ByteBuffer from index 2 to 6
        ByteBuffer slicedBuffer = byteBuffer.slice();
        slicedBuffer.position(2);
        slicedBuffer.limit(6);
    }
}
