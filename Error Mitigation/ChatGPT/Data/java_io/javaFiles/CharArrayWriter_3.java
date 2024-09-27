import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class CharArrayWriter_3 {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write("Hello, World!");

        StringWriter stringWriter = new StringWriter();
        try {
            charArrayWriter.writeTo(stringWriter);
            System.out.println(stringWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
