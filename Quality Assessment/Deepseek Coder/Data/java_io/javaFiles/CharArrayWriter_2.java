import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_2 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();
        char[] buffer = {'H', 'e', 'l', 'l', 'o'};

        try {
            writer.write(buffer, 0, buffer.length);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
