import java.nio.ShortBuffer;

public class ShortBuffer_2 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(5);
        buffer.put((short) 10);
        System.out.println(buffer.get(0));
    }
}
