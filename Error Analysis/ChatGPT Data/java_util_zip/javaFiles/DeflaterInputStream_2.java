import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class DeflaterInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            DeflaterInputStream dis = new DeflaterInputStream(fis);

            int availableBytes = dis.available();
            System.out.println("Available bytes to read: " + availableBytes);

            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
