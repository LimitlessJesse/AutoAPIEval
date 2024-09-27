import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_5 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        try {
            writer.write("Hello, World!");
            System.out.println(writer.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
