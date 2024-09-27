import java.io.IOException;
import java.io.StringWriter;

public class StringWriter_10 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
