import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("path_to_your_file");
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer))!= -1) {
                // Process the data in the buffer
                // For example, print the data
                System.out.write(buffer, 0, bytesRead);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
