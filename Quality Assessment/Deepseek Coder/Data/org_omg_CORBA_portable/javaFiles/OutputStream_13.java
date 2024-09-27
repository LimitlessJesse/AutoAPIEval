import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_13 {
    public static void main(String[] args) {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Get the OutputStream from the ByteArrayOutputStream
        OutputStream outputStream = baos.getOutputStream();

        // Write a character to the OutputStream
        char c = 'A';
        outputStream.write_wchar(c);

        // Convert the ByteArrayOutputStream to a byte array
        byte[] bytes = baos.toByteArray();

        // Print the byte array
        for (byte b : bytes) {
            System.out.println(b);
        }
    }
}
