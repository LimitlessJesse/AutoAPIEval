import java.nio.ShortBuffer;

public class ShortBuffer_5 {
    public static void main(String[] args) {
        ShortBuffer buffer = ShortBuffer.allocate(5);
        buffer.put(new short[]{1, 2, 3, 4, 5});
        
        ShortBuffer duplicatedBuffer = buffer.duplicate();
        System.out.println("Original Buffer: " + buffer.toString());
        System.out.println("Duplicated Buffer: " + duplicatedBuffer.toString());
    }
}
