import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_3 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        LineNumberReader reader = new LineNumberReader(new StringReader(input));

        try {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
