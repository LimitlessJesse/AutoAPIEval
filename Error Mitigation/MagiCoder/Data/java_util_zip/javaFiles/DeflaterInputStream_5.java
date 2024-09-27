import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;

public class DeflaterInputStream_5 {
    public static void main(String[] args) {
        try {
            // Create a byte array output stream
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            // Create a deflater output stream
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);

            // Write some data to the deflater output stream
            deflaterOutputStream.write("Hello, World!".getBytes());

            // Close the deflater output stream
            deflaterOutputStream.close();

            // Get the deflated data
            byte[] deflatedData = byteArrayOutputStream.toByteArray();

            // Create a byte array input stream
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(deflatedData);

            // Create a deflater input stream
            DeflaterInputStream deflaterInputStream = new DeflaterInputStream(byteArrayInputStream);

            // Read the data from the deflater input stream
            byte[] inflatedData = new byte[deflatedData.length];
            deflaterInputStream.read(inflatedData);

            // Print the inflated data
            System.out.println(new String(inflatedData));

            // Reset the deflater input stream
            deflaterInputStream.reset();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
