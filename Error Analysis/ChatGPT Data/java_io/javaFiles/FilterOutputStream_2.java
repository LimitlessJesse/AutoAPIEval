import java.io.*;

public class FilterOutputStream_2 {
    public static void main(String[] args) {
        try {
            byte[] bytesToWrite = {65, 66, 67, 68, 69}; // Corresponding to ASCII values A, B, C, D, E
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            FilterOutputStream filterOutputStream = new FilterOutputStream(outputStream) {
            };

            filterOutputStream.write(bytesToWrite);

            byte[] writtenBytes = outputStream.toByteArray();
            for (byte b : writtenBytes) {
                System.out.print((char) b + " ");
            }

            filterOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
