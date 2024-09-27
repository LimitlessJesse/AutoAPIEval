import javax.swing.ImageIcon;

public class ImageIcon_1 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path/to/image.png");
        int height = icon.getIconHeight();
        System.out.println("Icon height: " + height);
    }
}
