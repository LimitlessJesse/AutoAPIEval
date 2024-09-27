import javax.swing.ImageIcon;

public class ImageIcon_1 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path_to_image.jpg");
        int height = icon.getIconHeight();
        System.out.println("Icon height: " + height);
    }
}
