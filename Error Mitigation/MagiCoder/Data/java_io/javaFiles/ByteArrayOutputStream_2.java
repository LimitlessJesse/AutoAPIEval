import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_2 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(65); // 'A'
            outputStream.write(66); // 'B'
            outputStream.write(67); // 'C'
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] byteArray = outputStream.toByteArray();
        for (byte b : byteArray) {
            System.out.print((char) b);
        }
    }
}
