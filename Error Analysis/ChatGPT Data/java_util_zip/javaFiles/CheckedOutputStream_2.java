import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CheckedOutputStream;

public class CheckedOutputStream_2 {
    public static void main(String[] args) {
        byte[] data = {65, 66, 67, 68, 69}; // Sample byte array

        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             CheckedOutputStream checkedOutputStream = new CheckedOutputStream(byteArrayOutputStream, null)) {

            checkedOutputStream.write(data, 1, 3);

            byte[] result = byteArrayOutputStream.toByteArray();
            System.out.println("Resulting byte array after write: ");
            for (byte b : result) {
                System.out.print(b + " ");
            }
            System.out.println("\nChecksum value: " + checkedOutputStream.getChecksum().getValue());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
