import java.io.CharArrayWriter;

public class CharArrayWriter_4 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("Hello");
        System.out.println("Before reset: " + writer.toString());
        
        writer.reset();
        System.out.println("After reset: " + writer.toString());
    }
}
