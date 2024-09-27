import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write(65); // writing the byte value of 'A'
            fos.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
