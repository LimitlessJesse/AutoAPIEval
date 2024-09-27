import java.nio.CharBuffer;

public class CharBuffer_5 {
    public static void main(String[] args) {
        CharBuffer originalBuffer = CharBuffer.allocate(10);
        originalBuffer.put("Hello");
        
        CharBuffer duplicateBuffer = originalBuffer.duplicate();
        
        System.out.println("Original Buffer: " + originalBuffer.toString());
        System.out.println("Duplicate Buffer: " + duplicateBuffer.toString());
        
        originalBuffer.put(" World");
        
        System.out.println("Original Buffer after modification: " + originalBuffer.toString());
        System.out.println("Duplicate Buffer after modification: " + duplicateBuffer.toString());
    }
}
