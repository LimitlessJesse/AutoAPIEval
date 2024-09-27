import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_1 {
    public static void main(String[] args) {
        String text = "Line 1\nLine 2\nLine 3";
        
        try (LineNumberReader reader = new LineNumberReader(new StringReader(text))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int lineNumber = reader.getLineNumber();
                System.out.println("Line " + lineNumber + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
