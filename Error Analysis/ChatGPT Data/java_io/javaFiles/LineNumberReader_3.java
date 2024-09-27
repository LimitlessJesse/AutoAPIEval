import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.IOException;

public class LineNumberReader_3 {
    public static void main(String[] args) {
        try {
            LineNumberReader reader = new LineNumberReader(new FileReader("file.txt"));
            reader.setLineNumber(5);
            System.out.println("Current line number: " + reader.getLineNumber());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
