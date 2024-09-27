import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.IOException;

public class LineNumberReader_4 {
    public static void main(String[] args) {
        try {
            LineNumberReader reader = new LineNumberReader(new FileReader("example.txt"));
            long skippedChars = reader.skip(5);
            System.out.println("Skipped characters: " + skippedChars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
