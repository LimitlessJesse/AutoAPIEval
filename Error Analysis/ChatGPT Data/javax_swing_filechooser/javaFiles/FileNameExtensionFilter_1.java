import javax.swing.filechooser.FileNameExtensionFilter;

public class FileNameExtensionFilter_1 {
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        String description = filter.getDescription();
        System.out.println("Description: " + description);
    }
}
