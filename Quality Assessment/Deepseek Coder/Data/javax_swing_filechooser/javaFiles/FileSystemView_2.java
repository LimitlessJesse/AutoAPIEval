import javax.swing.filechooser.FileSystemView;

public class FileSystemView_2 {
    public static void main(String[] args) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        System.out.println(fsv.getHomeDirectory());
    }
}
