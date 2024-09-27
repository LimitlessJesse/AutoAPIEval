import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_3 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        String data = "Hello, World!";
        byte[] byteArray = data.getBytes();

        try {
            outputStream.write(byteArray, 0, byteArray.length);
            System.out.println(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
