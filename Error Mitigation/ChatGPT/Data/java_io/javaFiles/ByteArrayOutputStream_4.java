import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_4 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String data = "Hello, World!";
        
        try {
            byteArrayOutputStream.write(data.getBytes());
            byteArrayOutputStream.writeTo(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
