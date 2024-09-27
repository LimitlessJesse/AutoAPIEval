import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            DeflaterInputStream dis = new DeflaterInputStream(fis);
            
            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer, 0, buffer.length);
            
            while (bytesRead != -1) {
                // Process the compressed data in the buffer
                // Do something with the data
                
                bytesRead = dis.read(buffer, 0, buffer.length);
            }
            
            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
