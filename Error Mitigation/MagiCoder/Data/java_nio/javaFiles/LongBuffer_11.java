import java.nio.LongBuffer;

public class LongBuffer_11 {
    public static void main(String[] args) {
        LongBuffer longBuffer1 = LongBuffer.allocate(5);
        longBuffer1.put(0, 1L);
        longBuffer1.put(1, 2L);
        longBuffer1.put(2, 3L);
        longBuffer1.put(3, 4L);
        longBuffer1.put(4, 5L);

        LongBuffer longBuffer2 = LongBuffer.allocate(5);
        longBuffer2.put(0, 6L);
        longBuffer2.put(1, 7L);
        longBuffer2.put(2, 8L);
        longBuffer2.put(3, 9L);
        longBuffer2.put(4, 10L);

        longBuffer1.put(longBuffer2);

        longBuffer1.flip();
        while (longBuffer1.hasRemaining()) {
            System.out.println(longBuffer1.get());
        }
    }
}
