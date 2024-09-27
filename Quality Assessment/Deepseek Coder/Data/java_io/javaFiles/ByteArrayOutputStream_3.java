import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_3 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Create a byte array
        byte[] byteArray = {1, 2, 3, 4, 5};

        try {
            // Write the byte array to the output stream
            baos.write(byteArray, 1, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert the output stream to a byte array
        byte[] outputByteArray = baos.toByteArray();

        // Print the output byte array
        for (byte b : outputByteArray) {
            System.out.print(b + " ");
        }
    }
}
