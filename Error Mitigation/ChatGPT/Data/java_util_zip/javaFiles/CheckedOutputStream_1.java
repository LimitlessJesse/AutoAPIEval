import java.io.IOException;
import java.util.zip.CheckedOutputStream;

public class CheckedOutputStream_1 {
    public static void main(String[] args) {
        try {
            CheckedOutputStream cos = new CheckedOutputStream(System.out);
            cos.write(65); // writing byte 'A'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
