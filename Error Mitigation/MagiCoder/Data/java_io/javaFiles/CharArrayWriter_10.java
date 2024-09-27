import java.io.CharArrayWriter;

public class CharArrayWriter_10 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("Hello, World!");
        System.out.println("Size of the buffer: " + writer.size());
    }
}
