import java.io.StringBufferInputStream;

public class StringBufferInputStream_3 {
    public static void main(String[] args) {
        StringBufferInputStream stream = new StringBufferInputStream("Hello, World!");
        byte[] buffer = new byte[5];
        int bytesRead = stream.read(buffer, 0, 5);
        
        System.out.println("Bytes read: " + bytesRead);
        System.out.println("Data read: " + new String(buffer));
    }
}
