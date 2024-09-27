import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("example.txt");
            String str = "Hello, World!";
            byte[] byteArray = str.getBytes();

            for (int i = 0; i < byteArray.length; i++) {
                fos.write(byteArray[i]);
            }

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
