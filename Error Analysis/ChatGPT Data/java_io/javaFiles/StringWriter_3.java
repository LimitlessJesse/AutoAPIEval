import java.io.StringWriter;
import java.io.IOException;

public class StringWriter_3 {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        int offset = 1;
        int length = 3;

        try {
            writer.write(chars, offset, length);
            System.out.println(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
