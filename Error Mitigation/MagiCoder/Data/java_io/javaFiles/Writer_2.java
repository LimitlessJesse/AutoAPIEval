import java.io.Writer;
import java.io.StringWriter;
import java.io.IOException;

public class Writer_2 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
        try {
            writer.write(cbuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
