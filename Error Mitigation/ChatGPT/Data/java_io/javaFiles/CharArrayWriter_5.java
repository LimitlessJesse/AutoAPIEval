import java.io.CharArrayWriter;

public class CharArrayWriter_5 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("Hello, World!");

        char[] charArray = writer.toCharArray();

        System.out.println(charArray);
    }
}
