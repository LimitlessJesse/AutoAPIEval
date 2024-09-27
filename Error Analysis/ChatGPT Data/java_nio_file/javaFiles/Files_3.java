import java.io.IOException;
import java.nio.file.FileAttribute;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermissions;

public class Files_3 {
    public static void main(String[] args) {
        Path path = Paths.get("newFile.txt");
        
        FileAttribute<?>[] attrs = { PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-r-----")) };
        
        try {
            Files.createFile(path, attrs);
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.err.println("Failed to create file: " + e.getMessage());
        }
    }
}
