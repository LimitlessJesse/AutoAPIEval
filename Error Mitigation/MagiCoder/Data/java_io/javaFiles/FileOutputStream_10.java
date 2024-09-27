import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_10 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write("Hello, World!".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
