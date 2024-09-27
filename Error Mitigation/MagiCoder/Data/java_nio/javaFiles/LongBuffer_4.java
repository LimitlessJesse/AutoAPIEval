import java.nio.LongBuffer;

public class LongBuffer_4 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(10);
        System.out.println(buffer.hasArray());
    }
}
