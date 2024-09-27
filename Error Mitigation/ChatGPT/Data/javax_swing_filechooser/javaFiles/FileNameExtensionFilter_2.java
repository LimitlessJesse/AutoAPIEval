import javax.swing.filechooser.FileNameExtensionFilter;

public class FileNameExtensionFilter_2 {
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt", "text");
        String[] extensions = filter.getExtensions();
        for (String extension : extensions) {
            System.out.println(extension);
        }
    }
}
