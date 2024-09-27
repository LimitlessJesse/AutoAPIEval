import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptor_2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("example.txt");
            FileDescriptor fd = fos.getFD();
            
            // Write some data to the file
            fos.write("Hello, World!".getBytes());
            
            // Sync the file descriptor
            fd.sync();
            
            // Close the file output stream
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
