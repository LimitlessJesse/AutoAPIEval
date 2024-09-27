import java.io.LineNumberReader;
import java.io.StringReader;

public class LineNumberReader_2 {
    public static void main(String[] args) {
        String text = "Hello World!";
        StringReader stringReader = new StringReader(text);
        LineNumberReader reader = new LineNumberReader(stringReader);
        try {
            String line = reader.readLine();
            System.out.println("Line read: " + line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
