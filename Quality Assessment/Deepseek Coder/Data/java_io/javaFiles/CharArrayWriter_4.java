import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriter_4 {
    public static void main(String[] args) {
        CharArrayWriter writer = new CharArrayWriter();

        try {
            writer.write("Hello, World!");
            System.out.println("Before flush: " + writer.toString());

            writer.flush();
            System.out.println("After flush: " + writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
