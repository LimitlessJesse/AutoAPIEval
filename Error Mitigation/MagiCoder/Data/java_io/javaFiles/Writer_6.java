import java.io.Writer;
import java.io.IOException;

public class Writer_6 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
