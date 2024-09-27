import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_4 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] data = {1, 2, 3, 4, 5};

        try {
            outputStream.write(data, 1, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] outputData = outputStream.toByteArray();
        for (byte b : outputData) {
            System.out.print(b + " ");
        }
    }
}
