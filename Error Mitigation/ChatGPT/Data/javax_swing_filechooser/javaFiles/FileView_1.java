import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_1 {
    public static void main(String[] args) {
        FileView fileView = new FileView() {
            @Override
            public String getDescription(File f) {
                // Implementing the getDescription method
                if (f.getName().endsWith(".jpg")) {
                    return "A JPEG image file of James Gosling's face";
                } else {
                    return "Unknown file type";
                }
            }
        };

        // Example usage
        File file = new File("jag.jpg");
        String description = fileView.getDescription(file);
        System.out.println(description);
    }
}
