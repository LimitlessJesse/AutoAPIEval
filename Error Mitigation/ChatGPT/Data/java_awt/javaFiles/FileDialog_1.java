import java.awt.FileDialog;

public class FileDialog_1 {
    public static void main(String[] args) {
        FileDialog fileDialog = new FileDialog(null, "Select File", FileDialog.LOAD);
        fileDialog.setMode(FileDialog.SAVE);
    }
}
