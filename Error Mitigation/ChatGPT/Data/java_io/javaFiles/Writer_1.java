import java.io.IOException;
import java.io.StringWriter;

public class Writer_1 {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            char[] cbuf = {'H', 'e', 'l', 'l', 'o'};
            writer.write(cbuf);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
