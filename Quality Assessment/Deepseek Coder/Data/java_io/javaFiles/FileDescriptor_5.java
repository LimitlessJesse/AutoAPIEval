import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptor_5 {
    public static void main(String[] args) {
        FileDescriptor fd = new FileOutputStream(FileDescriptor.out).getFD();
        System.out.println("Is the file descriptor valid? " + fd.valid());
    }
}
