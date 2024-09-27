import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_3 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello\nWorld\nJava");
        LineNumberReader lineNumberReader = new LineNumberReader(stringReader);

        try {
            String line;
            while ((line = lineNumberReader.readLine())!= null) {
                System.out.println(lineNumberReader.getLineNumber() + ": " + line);
                lineNumberReader.setLineNumber(100);
                System.out.println("New line number: " + lineNumberReader.getLineNumber());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
