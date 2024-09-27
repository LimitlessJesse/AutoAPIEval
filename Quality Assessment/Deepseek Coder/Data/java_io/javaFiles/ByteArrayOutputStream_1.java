import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_1 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Writing integer value 65 to the output stream
        outputStream.write(65);

        // Converting the ByteArrayOutputStream to byte array
        byte[] byteArray = outputStream.toByteArray();

        // Printing the byte array
        for (byte b : byteArray) {
            System.out.println(b);
        }
    }
}
