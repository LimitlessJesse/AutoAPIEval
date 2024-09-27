import java.nio.ByteBuffer;
import java.nio.LongBuffer;

public class LongBuffer_6 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        LongBuffer longBuffer = byteBuffer.asLongBuffer();
        longBuffer.put(1234567890L);
        longBuffer.flip();
        while(longBuffer.hasRemaining()) {
            System.out.println(longBuffer.get());
        }
    }
}
