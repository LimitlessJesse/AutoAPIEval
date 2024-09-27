import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.IOException;

public class LineNumberReader_2 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello, World!");
        LineNumberReader lineNumberReader = new LineNumberReader(stringReader);

        try {
            lineNumberReader.setLineNumber(10);
            System.out.println("Line number: " + lineNumberReader.getLineNumber());
            System.out.println("Line: " + lineNumberReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
