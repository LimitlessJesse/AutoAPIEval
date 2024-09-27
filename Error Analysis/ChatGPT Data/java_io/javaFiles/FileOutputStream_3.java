import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            byte[] data = {65, 66, 67, 68, 69}; // ABCDE
            int off = 1;
            int len = 3;
            fos.write(data, off, len);
            fos.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
