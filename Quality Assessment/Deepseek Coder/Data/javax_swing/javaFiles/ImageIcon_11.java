import javax.swing.ImageIcon;

public class ImageIcon_11 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path_to_your_image");
        icon.setDescription("This is an image icon");
        System.out.println(icon.getDescription());
    }
}
