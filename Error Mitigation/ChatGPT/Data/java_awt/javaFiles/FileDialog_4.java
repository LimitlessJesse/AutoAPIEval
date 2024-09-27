import java.awt.FileDialog;

public class FileDialog_4 {
    public static void main(String[] args) {
        FileDialog fileDialog = new FileDialog(null, "Select File");
        fileDialog.setVisible(true);
        
        String directory = fileDialog.getDirectory();
        System.out.println("Selected directory: " + directory);
    }
}
