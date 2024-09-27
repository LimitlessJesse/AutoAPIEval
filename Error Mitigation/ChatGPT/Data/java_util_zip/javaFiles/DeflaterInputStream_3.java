import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("example.txt");
            DeflaterInputStream deflaterInput = new DeflaterInputStream(fileInput);
            
            int data = deflaterInput.read();
            while (data != -1) {
                System.out.print((char) data);
                data = deflaterInput.read();
            }
            
            deflaterInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
