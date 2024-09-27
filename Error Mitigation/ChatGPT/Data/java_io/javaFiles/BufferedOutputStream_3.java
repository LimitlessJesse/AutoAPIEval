import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_3 {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
            byte[] data = "Hello, World!".getBytes();
            int offset = 0;
            int length = data.length;
            bos.write(data, offset, length);
            bos.close();
            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
