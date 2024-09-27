import java.io.Writer;
import java.io.StringWriter;
import java.io.IOException;

public class Writer_3 {
    public static void main(String[] args) {
        Writer writer = new StringWriter();
        try {
            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
