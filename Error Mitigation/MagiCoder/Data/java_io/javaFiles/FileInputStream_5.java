import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_5 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            // Read from file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis!= null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
