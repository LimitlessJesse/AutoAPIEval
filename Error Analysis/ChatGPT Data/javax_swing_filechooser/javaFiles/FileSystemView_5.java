import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSystemView_5 {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File containingDir = fileSystemView.getHomeDirectory(); // example directory, change as needed

        File newFolder = fileSystemView.createFileObject(containingDir, "NewFolder");
        
        if (fileSystemView.isFileSystemRoot(newFolder)) {
            System.out.println("Cannot create folder at the root of the file system.");
        } else {
            if (fileSystemView.getFiles(containingDir, false).contains(newFolder)) {
                System.out.println("Folder already exists.");
            } else {
                boolean created = fileSystemView.createFileObject(containingDir, newFolder.getName()).mkdir();
                if (created) {
                    System.out.println("Folder created successfully.");
                } else {
                    System.out.println("Failed to create folder.");
                }
            }
        }
    }
}
