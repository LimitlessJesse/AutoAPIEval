import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_4 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        try {
            // Create a FileInputStream
            FileInputStream fis = new FileInputStream("file.txt");
            
            // Create a BufferedInputStream
            bis = new BufferedInputStream(fis);
            
            // Read from the BufferedInputStream
            int data = bis.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the BufferedInputStream
            if (bis!= null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
