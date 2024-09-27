import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;

public class FileSystemView_1 {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File containingDir = new File("C:/Users/User/Desktop");
        
        try {
            File newFolder = fileSystemView.createNewFolder(containingDir);
            System.out.println("New folder created: " + newFolder.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error creating new folder: " + e.getMessage());
        }
    }
}
