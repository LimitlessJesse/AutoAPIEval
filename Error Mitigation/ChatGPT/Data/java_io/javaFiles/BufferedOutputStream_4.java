import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_4 {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
            String data = "Hello, World!";
            bos.write(data.getBytes());
            bos.flush(); // Flush the buffered output stream
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
