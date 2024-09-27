import java.nio.ByteBuffer;

public class ByteBuffer_3 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        byte b = 65; // ASCII value of 'A'
        buffer.put(b);
        System.out.println("Byte value added to buffer: " + b);
    }
}
