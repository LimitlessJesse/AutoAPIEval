import javax.swing.filechooser.FileSystemView;

public class FileSystemView_3 {
    public static void main(String[] args) {
        FileSystemView fsv = FileSystemView.getFileSystemView();
        java.io.File[] roots = fsv.getRoots();
        for (int i = 0; i < roots.length; i++) {
            System.out.println(roots[i]);
        }
    }
}
