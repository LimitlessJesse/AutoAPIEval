import java.io.StringBufferInputStream;

public class StringBufferInputStream_4 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBufferInputStream stream = new StringBufferInputStream(str);
        
        // Get the number of bytes that can be read without blocking
        int bytesAvailable = stream.available();
        
        System.out.println("Number of bytes available: " + bytesAvailable);
    }
}
