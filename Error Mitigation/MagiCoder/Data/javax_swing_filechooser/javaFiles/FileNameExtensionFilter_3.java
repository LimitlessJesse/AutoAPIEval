import javax.swing.filechooser.FileNameExtensionFilter;

public class FileNameExtensionFilter_3 {
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
        String[] extensions = filter.getExtensions();
        for (String extension : extensions) {
            System.out.println(extension);
        }
    }
}
