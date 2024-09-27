import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("path_to_your_file");
            byte[] buffer = new byte[10];
            int offset = 0;
            int length = 5;
            int bytesRead = fis.read(buffer, offset, length);

            if (bytesRead!= -1) {
                System.out.println("Bytes read: " + bytesRead);
                System.out.println("Data: ");
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print((char) buffer[i]);
                }
            } else {
                System.out.println("No data available");
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
