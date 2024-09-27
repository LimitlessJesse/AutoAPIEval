import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_3 {
    public static void main(String[] args) {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Create an OutputStream from the ByteArrayOutputStream
        OutputStream outputStream = baos.getOutputStream();

        // Define a short value
        short value = 12345;

        // Use the write_short method to write the short value to the OutputStream
        outputStream.write_short(value);

        // Get the byte array from the ByteArrayOutputStream
        byte[] bytes = baos.toByteArray();

        // Print the byte array
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
