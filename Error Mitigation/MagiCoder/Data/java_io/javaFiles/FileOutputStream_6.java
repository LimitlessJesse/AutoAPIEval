import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            fos.write('H');
            fos.write('e');
            fos.write('l');
            fos.write('l');
            fos.write('o');
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
