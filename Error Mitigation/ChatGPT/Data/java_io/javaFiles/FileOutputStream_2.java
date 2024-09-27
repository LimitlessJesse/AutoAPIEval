import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            byte[] data = {65, 66, 67}; // ASCII values for A, B, C
            fos.write(data);
            fos.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
