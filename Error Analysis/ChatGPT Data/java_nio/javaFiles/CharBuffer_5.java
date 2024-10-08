import java.nio.CharBuffer;

public class CharBuffer_5 {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        buffer.put("Hello");
        CharBuffer duplicateBuffer = buffer.duplicate();
        System.out.println("Original Buffer: " + buffer.toString());
        System.out.println("Duplicate Buffer: " + duplicateBuffer.toString());
    }
}
