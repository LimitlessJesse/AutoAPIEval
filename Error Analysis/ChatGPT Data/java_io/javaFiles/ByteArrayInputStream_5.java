import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_5 {
    public static void main(String[] args) {
        // Create a new ByteArrayInputStream
        byte[] data = { 1, 2, 3, 4, 5 };
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);

        // Reset the ByteArrayInputStream
        inputStream.reset();

        // Read the data from the reset ByteArrayInputStream
        int byteRead = 0;
        while ((byteRead = inputStream.read()) != -1) {
            System.out.print(byteRead + " ");
        }
    }
}
