import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            byte[] data = "Hello, World!".getBytes();
            int offset = 0;
            int length = data.length;
            fos.write(data, offset, length);
            fos.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
