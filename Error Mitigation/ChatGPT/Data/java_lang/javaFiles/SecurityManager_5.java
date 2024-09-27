import java.io.FileDescriptor;
import java.lang.SecurityManager;

public class SecurityManager_5 {
    public static void main(String[] args) {
        SecurityManager securityManager = new SecurityManager();
        FileDescriptor fd = new FileDescriptor();
        
        try {
            securityManager.checkWrite(fd);
            System.out.println("Allowed to write to the specified file descriptor");
        } catch (SecurityException e) {
            System.out.println("Not allowed to write to the specified file descriptor");
        } catch (NullPointerException e) {
            System.out.println("File descriptor argument is null");
        }
    }
}
