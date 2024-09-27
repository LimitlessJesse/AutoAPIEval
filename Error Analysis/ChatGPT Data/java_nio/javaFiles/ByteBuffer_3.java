import java.nio.ByteBuffer;

public class ByteBuffer_3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        buffer.put(data);
        System.out.println("Bytes put into buffer");
    }
}
