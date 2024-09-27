import java.nio.ByteBuffer;

public class ByteBuffer_4 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 65);
        
        byte value = buffer.get();
        System.out.println("Byte value: " + value);
    }
}
