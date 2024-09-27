import java.io.IOException;
import java.io.InputStream;

public class Process_1 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls");
            InputStream inputStream = process.getInputStream();
            int data = 0;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
