import javax.swing.filechooser.FileNameExtensionFilter;

public class FileNameExtensionFilter_5 {
    public static void main(String[] args) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
        System.out.println(filter.toString());
    }
}
