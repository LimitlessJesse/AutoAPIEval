import java.io.FileDescriptor;

public class FileDescriptor_3 {
    public static void main(String[] args) {
        FileDescriptor fd = FileDescriptor.out;
        boolean isValid = fd.valid();
        System.out.println("Is valid: " + isValid);
    }
}
