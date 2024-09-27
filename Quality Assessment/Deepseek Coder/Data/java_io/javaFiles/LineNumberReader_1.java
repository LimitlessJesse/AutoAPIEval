import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReader_1 {
    public static void main(String[] args) {
        try {
            LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader("path_to_your_file")));
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(reader.getLineNumber() + ": " + line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
