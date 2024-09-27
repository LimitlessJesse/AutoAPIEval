import java.awt.FileDialog;

public class FileDialog_2 {
    public static void main(String[] args) {
        FileDialog fileDialog = new FileDialog(null, "Select File");
        fileDialog.setDirectory("C:/Users/User/Documents");
    }
}
