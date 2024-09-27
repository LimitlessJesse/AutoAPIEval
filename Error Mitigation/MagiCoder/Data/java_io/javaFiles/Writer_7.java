import java.io.IOException;
import java.io.Writer;

public class Writer_7 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
