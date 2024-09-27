import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            // do something with the file input stream
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
