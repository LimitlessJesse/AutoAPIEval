import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStream_5 {
    public static void main(String[] args) {
        try {
            byte[] bytes = {1, 2, 3, 4, 5};
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);

            System.out.println("Available bytes: " + bufferedInputStream.available());

            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
