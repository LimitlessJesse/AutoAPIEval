import java.nio.CharBuffer;

public class CharBuffer_1 {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(10);
        charBuffer.put("Hello");
        System.out.println("Remaining characters in buffer: " + charBuffer.length());
    }
}
