import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_5 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String s = "Hello, World!";
        byte[] strToBytes = s.getBytes();

        try {
            outputStream.write(strToBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] byteArray = outputStream.toByteArray();

        for (byte b : byteArray) {
            System.out.print((char)b);
        }
    }
}
