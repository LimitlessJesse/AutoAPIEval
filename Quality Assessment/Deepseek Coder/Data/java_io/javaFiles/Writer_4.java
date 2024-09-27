import java.io.Writer;
import java.io.StringWriter;
import java.io.IOException;

public class Writer_4 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        String str = "Hello, World!";
        int off = 6;
        int len = 5;
        try {
            writer.write(str, off, len);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(writer.toString());
    }
}
