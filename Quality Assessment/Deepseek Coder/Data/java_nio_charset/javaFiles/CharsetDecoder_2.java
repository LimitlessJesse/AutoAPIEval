import java.nio.charset.*;
import java.nio.*;

public class CharsetDecoder_2 {
    public static void main(String[] args) throws Exception {
        CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
        CharBuffer charBuffer = CharBuffer.allocate(1024);
        byte[] bytes = "Hello, World!".getBytes("UTF-8");
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        decoder.decode(byteBuffer, charBuffer, new CoderResult.CompletionHandler() {
            @Override
            public void completed(CoderResult coderResult) {
                if (coderResult.isUnderflow()) {
                    System.out.println("Underflow");
                } else if (coderResult.isOverflow()) {
                    System.out.println("Overflow");
                } else {
                    charBuffer.flip();
                    System.out.println(charBuffer.toString());
                }
            }

            @Override
            public void notYetCompleted(CoderResult coderResult) {
                System.out.println("Not yet completed");
            }

            @Override
            public void unmappableCharacter(CoderResult coderResult, int index) {
                System.out.println("Unmappable character at index: " + index);
            }
        });
    }
}
