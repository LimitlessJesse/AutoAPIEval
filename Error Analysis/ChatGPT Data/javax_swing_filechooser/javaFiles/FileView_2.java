import javax.swing.filechooser.FileView;
import java.io.File;

public class FileView_2 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        FileView fileView = new FileView();

        String typeDescription = fileView.getTypeDescription(file);
        System.out.println("Type Description: " + typeDescription);
    }
}
