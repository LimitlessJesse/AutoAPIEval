import javax.swing.filechooser.FileNameExtensionFilter;

public class FileNameExtensionFilter_1 {
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG and GIF Images", "jpg", "gif");
        System.out.println(filter.getDescription());
    }
}
