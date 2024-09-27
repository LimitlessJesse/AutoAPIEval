import java.io.FileReader;
import java.io.IOException;

public class Reader_5 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt");
            // Code to read from the file
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
