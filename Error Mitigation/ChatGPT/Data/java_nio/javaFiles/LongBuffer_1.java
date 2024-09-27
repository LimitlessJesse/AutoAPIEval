import java.nio.LongBuffer;

public class LongBuffer_1 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocate(5);
        for (int i = 0; i < buffer.capacity(); i++) {
            System.out.println(buffer.get(i));
        }
    }
}
