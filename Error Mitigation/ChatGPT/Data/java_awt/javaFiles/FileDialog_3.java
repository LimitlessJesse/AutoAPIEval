import java.awt.FileDialog;

public class FileDialog_3 {
    public static void main(String[] args) {
        FileDialog fileDialog = new FileDialog(null, "Select File");
        fileDialog.setFile("example.txt");
    }
}
