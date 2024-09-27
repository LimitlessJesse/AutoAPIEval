import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_6 {
    public static void main(String[] args) {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Create an OutputStream from the ByteArrayOutputStream
        OutputStream outputStream = baos.getOutputStream();

        // Write a double value to the OutputStream
        double value = 123.456;
        outputStream.write_double(value);

        // Convert the ByteArrayOutputStream to a byte array
        byte[] bytes = baos.toByteArray();

        // Print the byte array
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
