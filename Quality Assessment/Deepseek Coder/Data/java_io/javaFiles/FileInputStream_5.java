import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_5 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("example.txt");
            int availableBytes = inputStream.available();
            System.out.println("Available bytes: " + availableBytes);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
