import java.io.StringBufferInputStream;

public class StringBufferInputStream_2 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        StringBufferInputStream stream = new StringBufferInputStream("Hello World");
        int bytesRead = stream.read(buffer, 0, 5);
        System.out.println("Bytes read: " + bytesRead);
        System.out.println(new String(buffer));
    }
}
