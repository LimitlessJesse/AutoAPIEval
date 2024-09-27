import java.io.StringWriter;
import java.io.IOException;

public class StringWriter_9 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            writer.write("Hello, World!");
            System.out.println(writer.toString());
            writer.flush();
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
