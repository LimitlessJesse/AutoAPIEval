import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_2 {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            String data = "This is some data to write to the file.";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
