import java.io.FileDescriptor;

public class FileDescriptor_2 {
    public static void main(String[] args) {
        FileDescriptor fd = FileDescriptor.out;
        try {
            fd.sync();
            System.out.println("Synced successfully");
        } catch (Exception e) {
            System.out.println("Error syncing file descriptor: " + e.getMessage());
        }
    }
}
