import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_4 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("output.txt");
            DataOutputStream data = new DataOutputStream(file);

            data.writeUTF("Hello, World!");

            // Flushes the stream
            data.flush();

            // Closes the stream
            data.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
