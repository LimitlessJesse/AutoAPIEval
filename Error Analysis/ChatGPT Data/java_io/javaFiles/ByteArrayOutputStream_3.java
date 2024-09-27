import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_3 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write("Hello, World!".getBytes());
            
            byteArrayOutputStream.writeTo(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
