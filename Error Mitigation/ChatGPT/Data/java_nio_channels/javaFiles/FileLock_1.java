import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLock;

public class FileLock_1 {
    public static void main(String[] args) {
        FileLock fileLock = null; // Initialize your FileLock object here
        
        try {
            fileLock.release();
            System.out.println("Lock released successfully.");
        } catch (ClosedChannelException e) {
            System.out.println("ClosedChannelException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
