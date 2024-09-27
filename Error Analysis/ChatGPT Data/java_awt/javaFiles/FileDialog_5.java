import java.awt.FileDialog;

public class FileDialog_5 {
    public static void main(String[] args) {
        FileDialog fileDialog = new FileDialog(null, "Select File");
        fileDialog.setDirectory("C:\\Users\\User\\Desktop");
        fileDialog.setVisible(true);
        String selectedFile = fileDialog.getFile();
        
        if(selectedFile != null) {
            System.out.println("Selected file: " + selectedFile);
        } else {
            System.out.println("No file selected.");
        }
    }
}
