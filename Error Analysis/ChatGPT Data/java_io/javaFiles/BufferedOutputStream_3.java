import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] data = { 65, 66, 67, 68, 69 }; // ASCII values for A, B, C, D, E
            int offset = 1;
            int length = 3;

            bos.write(data, offset, length);

            bos.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
