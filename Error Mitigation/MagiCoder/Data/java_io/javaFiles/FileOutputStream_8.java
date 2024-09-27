import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_8 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String s = "Hello, World!";
            byte[] byteArray = s.getBytes();
            fos.write(byteArray, 0, byteArray.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
