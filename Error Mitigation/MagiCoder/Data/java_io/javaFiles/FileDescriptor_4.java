import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptor_4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            FileDescriptor fd = fos.getFD();
            fos.write("Hello, World!".getBytes());
            fd.sync();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
