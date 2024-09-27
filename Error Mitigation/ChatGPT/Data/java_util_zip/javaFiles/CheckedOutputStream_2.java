import java.io.IOException;
import java.util.zip.CheckedOutputStream;

public class CheckedOutputStream_2 {
    public static void main(String[] args) {
        try {
            CheckedOutputStream cos = new CheckedOutputStream(System.out, null);
            byte[] data = {65, 66, 67, 68, 69}; // Sample data
            cos.write(data, 0, data.length);
            cos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
