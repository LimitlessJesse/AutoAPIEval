import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_2 {
    public static void main(String[] args) {
        try {
            byte[] data = { 65, 66, 67, 68, 69 }; // ASCII values for A, B, C, D, E
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write(data);
            fos.close();
            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
