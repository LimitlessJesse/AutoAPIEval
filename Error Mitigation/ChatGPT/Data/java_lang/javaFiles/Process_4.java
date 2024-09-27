import java.io.OutputStream;
import java.io.IOException;

public class Process_4 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("echo Hello");
            OutputStream outputStream = process.getOutputStream();
            outputStream.write("World".getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
