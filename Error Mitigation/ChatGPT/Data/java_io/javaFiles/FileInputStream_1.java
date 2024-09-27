import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            int data = fis.read();
            while(data != -1) {
                System.out.print((char)data);
                data = fis.read();
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
