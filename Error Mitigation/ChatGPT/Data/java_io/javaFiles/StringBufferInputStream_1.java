import java.io.StringBufferInputStream;

public class StringBufferInputStream_1 {
    public static void main(String[] args) {
        StringBufferInputStream stream = new StringBufferInputStream("Hello World");
        
        int data;
        while ((data = stream.read()) != -1) {
            System.out.print((char) data);
        }
        
        stream.close();
    }
}
