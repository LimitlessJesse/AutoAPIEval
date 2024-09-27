import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStream_4 {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3, 4, 5};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);
        
        try {
            long skipped = inputStream.skip(2);
            System.out.println("Number of bytes skipped: " + skipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
