import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_5 {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("output.txt");
            String data = "Hello, World!";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream!= null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
