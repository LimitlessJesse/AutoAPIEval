import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_9 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            baos.write(100);
            baos.write(101);
            baos.write(102);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Size of ByteArrayOutputStream: " + baos.count);
    }
}
