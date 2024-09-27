import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;

public class CheckedInputStream_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.zip");
            CheckedInputStream checkedInputStream = new CheckedInputStream(fis);
            int byteRead = checkedInputStream.read();
            System.out.println("Byte read: " + byteRead);
            checkedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
