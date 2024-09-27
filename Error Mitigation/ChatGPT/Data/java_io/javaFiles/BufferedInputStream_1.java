import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_1 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"));
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
