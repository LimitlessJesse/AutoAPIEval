import java.nio.CharBuffer;

public class CharBuffer_4 {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        buffer.put("Hello, World".toCharArray());
        
        CharBuffer slicedBuffer = buffer.slice();
        
        System.out.println("Original buffer: " + buffer.toString());
        System.out.println("Sliced buffer: " + slicedBuffer.toString());
    }
}
