import java.io.FileDescriptor;
import java.io.SyncFailedException;

public class FileDescriptor_2 {
    public static void main(String[] args) {
        FileDescriptor fd = new FileDescriptor();
        
        try {
            fd.sync();
            System.out.println("Sync successful");
        } catch (SyncFailedException e) {
            System.out.println("Sync failed: " + e.getMessage());
        }
    }
}
