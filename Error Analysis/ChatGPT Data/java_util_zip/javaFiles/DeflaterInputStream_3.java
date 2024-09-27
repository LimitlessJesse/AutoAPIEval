import java.util.zip.DeflaterInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DeflaterInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("example.txt");
            DeflaterInputStream inflater = new DeflaterInputStream(fileInput);
            System.out.println("markSupported(): " + inflater.markSupported());
            inflater.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
