import java.awt.FileDialog;
import java.awt.Frame;
import java.io.FilenameFilter;

public class FileDialog_6 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select File", FileDialog.LOAD);
        fileDialog.setFilenameFilter(new FilenameFilter() {
            @Override
            public boolean accept(java.io.File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        fileDialog.setVisible(true);
        String file = fileDialog.getFile();
        String directory = fileDialog.getDirectory();
        System.out.println("Selected file: " + file);
        System.out.println("Selected directory: " + directory);
    }
}
