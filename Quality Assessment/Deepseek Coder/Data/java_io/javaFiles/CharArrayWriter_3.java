import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_3 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        String str = "Hello, World!";
        int off = 0;
        int len = 5;

        try {
            writer.write(str, off, len);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
