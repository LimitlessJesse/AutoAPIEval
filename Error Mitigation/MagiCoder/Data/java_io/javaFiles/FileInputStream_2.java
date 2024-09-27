import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("path_to_your_file");
            int i;
            while ((i = fileInputStream.read())!= -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
