import java.io.FilePermission;

public class FilePermission_4 {
    public static void main(String[] args) {
        FilePermission filePerm = new FilePermission("/path/to/file", "read");
        int hashCode = filePerm.hashCode();
        System.out.println("Hashcode of FilePermission object: " + hashCode);
    }
}
