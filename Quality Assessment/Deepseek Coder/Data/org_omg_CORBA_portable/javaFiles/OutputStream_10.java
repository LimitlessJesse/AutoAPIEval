import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_10 {
    public static void main(String[] args) {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Create an OutputStream from the ByteArrayOutputStream
        OutputStream outputStream = baos.getOutputStream();

        // The long value to be written
        long l = 1234567890L;

        // Use the write_longlong method to write the long value
        outputStream.write_longlong(l);

        // Convert the ByteArrayOutputStream to a byte array
        byte[] bytes = baos.toByteArray();

        // Print the byte array
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
