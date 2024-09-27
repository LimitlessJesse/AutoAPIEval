import java.nio.LongBuffer;

public class LongBuffer_25 {
    public static void main(String[] args) {
        LongBuffer buffer = LongBuffer.allocateDirect(10);
        System.out.println(buffer.isDirect());
    }
}
