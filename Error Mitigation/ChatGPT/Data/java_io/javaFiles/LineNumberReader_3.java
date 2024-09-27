import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_3 {
    public static void main(String[] args) {
        String text = "This is a sample text.\nThis is another line.";
        StringReader stringReader = new StringReader(text);
        LineNumberReader reader = new LineNumberReader(stringReader);

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + reader.getLineNumber() + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
