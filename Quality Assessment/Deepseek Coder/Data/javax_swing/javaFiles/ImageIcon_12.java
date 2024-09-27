import javax.swing.ImageIcon;

public class ImageIcon_12 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path_to_your_image.jpg");
        String description = icon.getDescription();
        System.out.println(description);
    }
}
