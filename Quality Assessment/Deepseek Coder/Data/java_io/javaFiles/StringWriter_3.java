import java.io.StringWriter;
import java.io.IOException;

public class StringWriter_3 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        char[] buffer = {'H', 'e', 'l', 'l', 'o'};
        try {
            writer.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
