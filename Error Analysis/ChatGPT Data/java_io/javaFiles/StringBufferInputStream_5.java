import java.io.StringBufferInputStream;

public class StringBufferInputStream_5 {
    public static void main(String[] args) {
        StringBufferInputStream stream = new StringBufferInputStream("Hello, World!");

        // Use reset() method
        stream.reset();

        int data;
        while ((data = stream.read()) != -1) {
            System.out.print((char) data);
        }
    }
}
