import java.awt.FileDialog;

public class FileDialog_4 {
    public static void main(String[] args) {
        FileDialog fileDialog = new FileDialog(null, "Select File");
        fileDialog.setFile("example.txt");
        fileDialog.setVisible(true);
    }
}
