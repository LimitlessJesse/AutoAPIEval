import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_2 {
    public static void main(String[] args) {
        LineNumberReader reader = new LineNumberReader(new StringReader("Line 1\nLine 2\nLine 3"));
        
        try {
            reader.setLineNumber(5);
            System.out.println("Current line number: " + reader.getLineNumber());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
