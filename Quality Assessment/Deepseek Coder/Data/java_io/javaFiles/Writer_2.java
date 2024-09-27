import java.io.Writer;
import java.io.StringWriter;
import java.io.IOException;

public class Writer_2 {
    public static void main(String[] args) {
        Writer writer = new StringWriter();
        try {
            char[] charArray = {'H', 'e', 'l', 'l', 'o'};
            writer.write(charArray);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
