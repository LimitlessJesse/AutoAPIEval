import java.io.FilePermission;

public class FilePermission_3 {
    public static void main(String[] args) {
        // Creating two FilePermission objects
        FilePermission filePerm1 = new FilePermission("/tmp/*", "read");
        FilePermission filePerm2 = new FilePermission("/tmp/*", "read");

        // Checking if the two FilePermission objects are equal
        boolean isEqual = filePerm1.equals(filePerm2);
        
        System.out.println("Are the FilePermission objects equal? " + isEqual);
    }
}
