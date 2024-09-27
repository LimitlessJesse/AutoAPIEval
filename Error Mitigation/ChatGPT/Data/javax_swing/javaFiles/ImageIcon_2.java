import javax.swing.ImageIcon;

public class ImageIcon_2 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path/to/image.jpg");
        int width = icon.getIconWidth();
        System.out.println("Icon width: " + width);
    }
}
