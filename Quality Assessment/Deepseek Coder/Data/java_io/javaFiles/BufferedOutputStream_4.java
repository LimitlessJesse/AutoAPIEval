import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String text = "Hello, World!";
            byte[] buffer = text.getBytes();

            bufferedOutputStream.write(buffer);

            // Flush the stream
            bufferedOutputStream.flush();

            bufferedOutputStream.close();
            fileOutputStream.close();

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
