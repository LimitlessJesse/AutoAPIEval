import java.io.IOException;
import java.io.OutputStream;

public class Process_2 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("echo Hello");
            OutputStream outputStream = process.getOutputStream();
            outputStream.write(Hello.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
