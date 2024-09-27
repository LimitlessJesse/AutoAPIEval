import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class LineNumberReader_2 {
    public static void main(String[] args) {
        String input = "Hello\nWorld\nJava";
        BufferedReader reader = new BufferedReader(new StringReader(input));
        LineNumberReader lineReader = new LineNumberReader(reader);

        try {
            String line;
            while ((line = lineReader.readLine())!= null) {
                System.out.println("Line " + lineReader.getLineNumber() + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
